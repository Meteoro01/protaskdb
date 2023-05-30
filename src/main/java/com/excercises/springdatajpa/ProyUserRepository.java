package com.excercises.springdatajpa;

import com.excercises.springdatajpa.entidades.Proy_User;
import com.excercises.springdatajpa.entidades.Proyecto;
import com.excercises.springdatajpa.entidades.Tarea;
import com.excercises.springdatajpa.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProyUserRepository extends JpaRepository<Proy_User,Long> {
}
