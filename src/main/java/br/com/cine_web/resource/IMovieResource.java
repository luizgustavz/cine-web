package br.com.cine_web.resource;

import br.com.cine_web.domain.Movie;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/movie")
public interface IMovieResource {

    @PostMapping("/register")
    ResponseEntity<Movie> register(@RequestBody Movie movie);

}
