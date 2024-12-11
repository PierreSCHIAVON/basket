package com.project.basket.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.time.OffsetDateTime;

@Entity
@Data
@Getter
@Setter
@Table(name = "contest")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Contest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_contest", nullable = false)
    private Long idContest;
    @Column(name = "heure_debut", nullable = false)
    private OffsetDateTime heureDebut;
    @Column(name = "heure_fin")
    private OffsetDateTime heureFin;
    @Column(name = "type_evenement", length = 50)
    private String typeEvenement;
}
