package br.com.cine_web.usecase.impl;

import br.com.cine_web.domain.Category;
import br.com.cine_web.domain.repository.ICategoryRepository;
import br.com.cine_web.usecase.ICategoryUsecase;
import org.springframework.stereotype.Service;

@Service
public class CategoryUsecaseImpl implements ICategoryUsecase {

    private final ICategoryRepository repository;

    public CategoryUsecaseImpl(ICategoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public Category register(Category category) {
        return repository.save(category);
    }
}
