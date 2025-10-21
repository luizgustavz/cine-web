package br.com.cine_web.usecase.impl;

import br.com.cine_web.domain.User;
import br.com.cine_web.domain.repository.IUserRepository;
import br.com.cine_web.usecase.IUserUsecase;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserUsecaseImpl implements IUserUsecase {

    private final IUserRepository repository;
    private final PasswordEncoder encoder;

    public UserUsecaseImpl(IUserRepository repository, PasswordEncoder encoder) {
        this.repository = repository;
        this.encoder = encoder;
    }

    @Override
    public User register(User user) {
        String password = user.getPassword();
        user.setPassword(encoder.encode(password));
        return repository.save(user);
    }
}
