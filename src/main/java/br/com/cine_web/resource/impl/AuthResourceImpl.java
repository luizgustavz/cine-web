package br.com.cine_web.resource.impl;

import br.com.cine_web.configuration.TokenConfiguration;
import br.com.cine_web.domain.User;
import br.com.cine_web.resource.IAuthResource;
import br.com.cine_web.usecase.impl.UserUsecaseImpl;
import br.com.cine_web.util.LoginResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthResourceImpl implements IAuthResource {

    private final UserUsecaseImpl usecase;
    private final AuthenticationManager manager;
    private final TokenConfiguration token;

    public AuthResourceImpl(UserUsecaseImpl usecase, AuthenticationManager manager, TokenConfiguration token) {
        this.usecase = usecase;
        this.manager = manager;
        this.token = token;
    }

    @Override
    public ResponseEntity<User> register(User user) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(usecase.register(user));
    }

    @Override
    public ResponseEntity<LoginResponse> login(User user) {
        UsernamePasswordAuthenticationToken emailAndPass = new UsernamePasswordAuthenticationToken(user.getEmail(), user.getPassword());
        Authentication authentication = manager.authenticate(emailAndPass);
        User principal = (User) authentication.getPrincipal();
        var t = token.generatedToken(principal);
        return ResponseEntity.ok(new LoginResponse(t));


    }
}
