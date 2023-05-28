package com.excercises.springdatajpa;

import com.excercises.springdatajpa.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosRepository extends JpaRepository<Usuario,Long> {
}
