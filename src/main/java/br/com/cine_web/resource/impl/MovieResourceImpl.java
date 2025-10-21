package br.com.cine_web.resource.impl;

import br.com.cine_web.domain.Movie;
import br.com.cine_web.resource.IMovieResource;
import br.com.cine_web.usecase.impl.MovieUsecaseImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieResourceImpl implements IMovieResource {

    private final MovieUsecaseImpl usecase;

    public MovieResourceImpl(MovieUsecaseImpl usecase) {
        this.usecase = usecase;
    }

    @Override
    public ResponseEntity<Movie> register(Movie movie) {
        usecase.register(movie);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .build();
    }

    @Override
    public ResponseEntity<List<Movie>> findAll() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(usecase.findAll());
    }
}
