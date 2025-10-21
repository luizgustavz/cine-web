package br.com.cine_web.usecase.impl;

import br.com.cine_web.domain.User;
import br.com.cine_web.domain.repository.IUserRepository;
import br.com.cine_web.usecase.IUserUsecase;
import org.springframework.stereotype.Service;

@Service
public class UserUsecaseImpl implements IUserUsecase {

    private final IUserRepository repository;

    public UserUsecaseImpl(IUserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User register(User user) {
        return repository.save(user);
    }
}
