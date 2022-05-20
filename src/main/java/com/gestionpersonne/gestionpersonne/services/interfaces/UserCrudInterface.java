package com.gestionpersonne.gestionpersonne.services.interfaces;

import com.gestionpersonne.gestionpersonne.models.entities.CustomUser;

import java.util.List;

public interface UserCrudInterface {
    public List<? extends CustomUser> findAll();
}
