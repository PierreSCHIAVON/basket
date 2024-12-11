package com.project.basket.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Entity
@Data
@Getter
@Setter
@Table(name = "joueur")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Joueur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_joueur", nullable = false)
    private Long idJoueur;
    @Column(name = "pseudo", nullable = false, length = 200)
    private String pseudo;
    @Column(name = "nom", nullable = false, length = 200)
    private String nom;
    @Column(name = "prenom", nullable = false, length = 200)
    private String prenom;
    @Column(name = "age", nullable = false)
    private Integer age; // Changement de String à Integer pour un âge numérique.
    @Column(name = "niveau", nullable = false, length = 50)
    private String niveau;
}
