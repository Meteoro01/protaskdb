package com.excercises.springdatajpa;

import com.excercises.springdatajpa.entidades.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TareasRepository extends JpaRepository<Tarea,Long> {
}
