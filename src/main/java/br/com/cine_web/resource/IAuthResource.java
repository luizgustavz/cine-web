package br.com.cine_web.resource;

import br.com.cine_web.domain.User;
import br.com.cine_web.util.LoginResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/ws")
public interface IAuthResource {

    @PostMapping("/register")
    ResponseEntity<User> register(@RequestBody User user);

    @PostMapping("/login")
    ResponseEntity<LoginResponse> login(@RequestBody User user);
}
