package com.novidades.gestaodeprojetos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.novidades.gestaodeprojetos.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
