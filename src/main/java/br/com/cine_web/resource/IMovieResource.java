package br.com.cine_web.resource;

import br.com.cine_web.domain.Movie;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/movie")
public interface IMovieResource {

    @PostMapping("/register")
    ResponseEntity<Movie> register(@RequestBody Movie movie);

    @GetMapping
    ResponseEntity<List<Movie>> findAll();

    @GetMapping("/{id}")
    ResponseEntity<Movie> findById(@PathVariable Long id);
}
