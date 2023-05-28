package com.excercises.springdatajpa;

import com.excercises.springdatajpa.entidades.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProyectoRepository extends JpaRepository<Proyecto,Long> {
}
