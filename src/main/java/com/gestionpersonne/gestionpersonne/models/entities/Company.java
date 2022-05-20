package com.gestionpersonne.gestionpersonne.models.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Company extends CustomUser{
    @Column(name = "serialNumber") @Getter @Setter @NonNull String serialNumber;
}
