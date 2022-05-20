package com.gestionpersonne.gestionpersonne.models.repositories;

import com.gestionpersonne.gestionpersonne.models.entities.CustomUser;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<CustomUser, Long> {
    CustomUser findByUsername(String username);

    List<CustomUser> findByUsernameContaining(String username);
}
