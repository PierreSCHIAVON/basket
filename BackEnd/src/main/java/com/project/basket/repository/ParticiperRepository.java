package com.project.basket.repository;

import com.project.basket.entity.Participer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticiperRepository extends JpaRepository <Participer, Long> {
}
