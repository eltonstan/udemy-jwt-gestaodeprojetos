package com.novidades.gestaodeprojetos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.novidades.gestaodeprojetos.model.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long> {
}
