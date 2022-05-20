package com.gestionpersonne.gestionpersonne.models.repositories;

import com.gestionpersonne.gestionpersonne.models.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PersonRepository extends JpaRepository<Person, Long>{
}
