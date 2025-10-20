package br.com.cine_web.resource;

import br.com.cine_web.domain.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/category")
public interface ICategoryResource {

    @PostMapping("/register")
    ResponseEntity<Void> register(@RequestBody Category category);

}
