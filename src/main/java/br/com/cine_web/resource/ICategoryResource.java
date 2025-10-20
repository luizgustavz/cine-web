package br.com.cine_web.resource;

import br.com.cine_web.domain.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/category")
public interface ICategoryResource {

    @PostMapping("/register")
    ResponseEntity<Void> register(@RequestBody Category category);

    @GetMapping("/{id}")
    ResponseEntity<Category> findById(@PathVariable Long id);

    @GetMapping
    ResponseEntity<List<Category>> findAll();

    @DeleteMapping("/{id}")
    ResponseEntity<Void> dropById(@PathVariable Long id);


}
