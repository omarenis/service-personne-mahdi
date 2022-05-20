package com.gestionpersonne.gestionpersonne.services.interfaces;

import com.gestionpersonne.gestionpersonne.models.entities.CustomUser;
import com.gestionpersonne.gestionpersonne.models.entities.Person;

import java.util.List;
import java.util.Optional;

public interface UserCrudInterface {
    public List<? extends CustomUser> findAll();
    public Optional<? extends CustomUser> findByUsername(String username);

    public List<? extends Person> findByFirstnameContaining();

    public List<? extends  Person> findByLastnameContaining();

    public List<? extends  Person> findByEmail();
}
