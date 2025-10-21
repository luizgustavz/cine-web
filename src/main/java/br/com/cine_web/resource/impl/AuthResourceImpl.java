package br.com.cine_web.resource.impl;

import br.com.cine_web.domain.User;
import br.com.cine_web.resource.IAuthResource;
import br.com.cine_web.usecase.impl.UserUsecaseImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthResourceImpl implements IAuthResource {

    private final UserUsecaseImpl usecase;

    public AuthResourceImpl(UserUsecaseImpl usecase) {
        this.usecase = usecase;
    }

    @Override
    public ResponseEntity<User> register(User user) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(usecase.register(user));
    }
}
