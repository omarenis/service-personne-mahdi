package com.gestionpersonne.gestionpersonne.models.repositories;

import com.gestionpersonne.gestionpersonne.models.entities.CustomUser;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<CustomUser, Long> {
    CustomUser findByUsername(@NonNull String username);
}
