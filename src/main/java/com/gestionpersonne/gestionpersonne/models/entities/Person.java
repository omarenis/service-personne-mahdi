package com.gestionpersonne.gestionpersonne.models.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class Person extends User{
    @NonNull @Column(name = "firstname") @Getter @Setter private String firstname;
    @NonNull @Column(name = "lastname") @Getter @Setter private String lastname;
}
