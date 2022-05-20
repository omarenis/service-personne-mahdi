package com.gestionpersonne.gestionpersonne.models.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Client extends Person {
    @Id @Column(name = "id", nullable = false) @NonNull private Long id;
    @Column(name = "totalAmountPayed") @Getter @Setter private float totalAmountPayed;
    @Column(name = "numberCommands") @Getter @Setter private int numberCommands;
}
