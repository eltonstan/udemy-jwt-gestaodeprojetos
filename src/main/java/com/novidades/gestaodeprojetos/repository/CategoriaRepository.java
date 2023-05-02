package com.novidades.gestaodeprojetos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.novidades.gestaodeprojetos.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
