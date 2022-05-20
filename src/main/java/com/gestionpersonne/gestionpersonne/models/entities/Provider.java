package com.gestionpersonne.gestionpersonne.models.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class Provider extends Person{
    @Column(name = "numberArticles") @Getter @Setter private int numberArticles;
    @Column(name = "numberStores") @Getter @Setter private int numberStores;
}
