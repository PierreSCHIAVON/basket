package com.project.basket.repository;

import com.project.basket.entity.Contest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContestRepository extends JpaRepository<Contest, Long> {
}
