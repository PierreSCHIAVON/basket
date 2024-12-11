package com.project.basket.repository;

import com.project.basket.entity.Joueur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JoueurRepository extends JpaRepository<Joueur, Long> {
}
