package br.com.cine_web.usecase;

import br.com.cine_web.domain.Movie;

import java.util.List;

public interface IMovieUsecase {

    Movie register(Movie movie);

    List<Movie> findAll();
}