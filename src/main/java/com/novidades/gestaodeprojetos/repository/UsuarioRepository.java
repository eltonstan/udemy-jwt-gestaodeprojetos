package com.novidades.gestaodeprojetos.repository;

import java.util.Optional;

import com.novidades.gestaodeprojetos.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmail(String email);
}
