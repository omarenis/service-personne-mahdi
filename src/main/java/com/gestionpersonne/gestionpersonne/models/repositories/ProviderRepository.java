package com.gestionpersonne.gestionpersonne.models.repositories;

import com.gestionpersonne.gestionpersonne.models.entities.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProviderRepository extends JpaRepository<Provider, Long> {
}