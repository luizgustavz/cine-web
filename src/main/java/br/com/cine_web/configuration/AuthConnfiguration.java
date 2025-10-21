package br.com.cine_web.configuration;

import br.com.cine_web.domain.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthConnfiguration implements UserDetailsService {

    private final IUserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return repository.findUserByEmail(username).orElseThrow( () -> new UsernameNotFoundException("Email or password invalid"));
    }
}
