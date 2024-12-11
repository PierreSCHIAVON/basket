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
public class Participer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Participer", nullable = false)
    private Long idParticiper;

    @Column(name = "Id_Terrain", nullable = false)
    private Long idTerrain;

    @Column(name = "Id_Contest", nullable = false)
    private Long idContest;

    @Column(name = "Id_Joueur", nullable = false)
    private Long idJoueur;

}
