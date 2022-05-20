package com.gestionpersonne.gestionpersonne.models.entities;


import jakarta.validation.constraints.Email;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class CustomUser extends User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Getter private Long id;
    @Column(name = "email") @NonNull @Email @Getter @Setter private String email;
    @Column(name = "password") @NonNull @Getter @Setter private String password;
    @Column(name = "role") @NonNull @Getter @Setter private String role;
    @Column(name = "username") @NonNull @Getter @Setter private String username;

    public CustomUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }

    public CustomUser(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
    }

    public CustomUser() {
        super("", "", new ArrayList<>());
    }
}
