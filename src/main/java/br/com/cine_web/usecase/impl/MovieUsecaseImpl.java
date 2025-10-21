package br.com.cine_web.usecase.impl;

import br.com.cine_web.domain.Movie;
import br.com.cine_web.domain.repository.IMovieRepository;
import br.com.cine_web.usecase.IMovieUsecase;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieUsecaseImpl implements IMovieUsecase {

    private final IMovieRepository repository;

    public MovieUsecaseImpl(IMovieRepository repository) {
        this.repository = repository;
    }


    @Override
    public Movie register(Movie movie) {
        return repository.save(movie);
    }

    @Override
    public List<Movie> findAll() {
        return repository.findAll();
    }

    @Override
    public Movie findById(Long id) {
        return repository.findById(id).orElse(null);
    }
}
