package com.gestionpersonne.gestionpersonne.models.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Client extends Person{
    @Column(name = "totalAmountPayed") @Getter @Setter private float totalAmountPayed;
}
