package br.com.cine_web.usecase;

import br.com.cine_web.domain.Category;

import java.util.List;

public interface ICategoryUsecase {

    Category register(Category category);

    Category findById(Long id);

    List<Category> findAll();

    void dropById(Long id);
}
