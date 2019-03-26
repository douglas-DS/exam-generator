package br.com.ds.examgenerator.security.service;

import br.com.ds.examgenerator.persistence.model.ApplicationUser;
import br.com.ds.examgenerator.persistence.repository.ApplicationUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author Douglas Souza on 25/03/2019
 */
@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final ApplicationUserRepository applicationUserRepository;

    @Autowired
    public CustomUserDetailsService(ApplicationUserRepository applicationUserRepository) {
        this.applicationUserRepository = applicationUserRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        ApplicationUser applicationUser = loadApplicationUserByUserName(username);
        return
    }

    public ApplicationUser loadApplicationUserByUserName(String username) {
        return Optional.ofNullable(applicationUserRepository
                .findByUsername(username))
                .orElseThrow(() -> new UsernameNotFoundException("ApplicationUser not found"));
    }

    private static final class CustomUserDetails extends ApplicationUser implements UserDetails {
    }
}
