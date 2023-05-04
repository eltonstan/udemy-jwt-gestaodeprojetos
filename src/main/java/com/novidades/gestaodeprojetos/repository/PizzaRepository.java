package com.novidades.gestaodeprojetos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.novidades.gestaodeprojetos.model.Pizza;

public interface PizzaRepository extends JpaRepository<Pizza, Long> {
}
