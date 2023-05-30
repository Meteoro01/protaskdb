package com.excercises.springdatajpa;

import com.excercises.springdatajpa.entidades.Proyecto;
import com.excercises.springdatajpa.entidades.Usuario_Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioProyectoRepository extends JpaRepository<Usuario_Proyecto,Long> {
}
