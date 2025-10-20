package br.com.cine_web.usecase.impl;

import br.com.cine_web.domain.Category;
import br.com.cine_web.domain.repository.ICategoryRepository;
import br.com.cine_web.usecase.ICategoryUsecase;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public Category findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Category> findAll() {
        return repository.findAll();
    }

    @Override
    public void dropById(Long id) {
        repository.deleteById(id);
    }
}
