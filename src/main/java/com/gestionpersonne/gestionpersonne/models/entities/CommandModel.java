package com.gestionpersonne.gestionpersonne.models.entities;

import lombok.*;


@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class CommandModel {
    @Getter private Long id;
    @Getter @Setter private float total;
    @Getter @Setter private float totalHT;
    @Getter @Setter private float totalTTC;
}
