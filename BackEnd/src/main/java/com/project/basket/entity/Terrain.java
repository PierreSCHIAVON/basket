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
@Table(name = "terrain")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Terrain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Terrain", nullable = false)
    private Long idTerrain;
    @Column(name = "nom", nullable = false, length = 200)
    private String nom;
    @Column(name = "adresse", nullable = false, length = 500)
    private String adresse;
    @Column(name = "horaire_ouverture")
    private java.time.LocalTime horaireOuverture;
    @Column(name = "horaire_fermeture")
    private java.time.LocalTime horaireFermeture;
    @Column(name = "type_terrain", length = 100)
    private String typeTerrain;
    @Column(name = "condition_filets", length = 50)
    private String conditionFilets;
    @Column(name = "eclairage")
    private Boolean eclairage;
    @Column(name = "proprietaire", length = 50)
    private String proprietaire;
    @Column(name = "latitude", length = 50)
    private String latitude;
    @Column(name = "longitude", length = 50)
    private String longitude;
}
