package com.novidades.gestaodeprojetos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.novidades.gestaodeprojetos.model.Ingrediente;

public interface IngredienteRepository extends JpaRepository<Ingrediente, Long> {
}
