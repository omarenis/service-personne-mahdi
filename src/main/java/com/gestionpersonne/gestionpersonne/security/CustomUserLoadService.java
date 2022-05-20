package com.gestionpersonne.gestionpersonne.security;

import com.gestionpersonne.gestionpersonne.models.entities.CustomUser;
import com.gestionpersonne.gestionpersonne.models.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserLoadService implements UserDetailsService {
    private final UserRepository userRepository;

    @Autowired
    public CustomUserLoadService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        CustomUser customUser = this.userRepository.findByUsername(username);
        if (customUser != null && customUser.isAccountNonExpired() && customUser.isAccountNonLocked())
        {
            return customUser;
        }
        return null;
    }
}
