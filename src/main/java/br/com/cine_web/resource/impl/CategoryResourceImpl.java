package br.com.cine_web.resource.impl;

import br.com.cine_web.domain.Category;
import br.com.cine_web.resource.ICategoryResource;
import br.com.cine_web.usecase.impl.CategoryUsecaseImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryResourceImpl implements ICategoryResource {

    private final CategoryUsecaseImpl usecase;

    public CategoryResourceImpl(CategoryUsecaseImpl usecase) {
        this.usecase = usecase;
    }

    @Override
    public ResponseEntity<Void> register(Category category) {
        usecase.register(category);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .build();
    }

    @Override
    public ResponseEntity<Category> findById(Long id) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(usecase.findById(id));
    }
}
