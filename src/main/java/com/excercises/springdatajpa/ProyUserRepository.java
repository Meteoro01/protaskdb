package com.excercises.springdatajpa;

import com.excercises.springdatajpa.entidades.Proy_User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProyUserRepository extends JpaRepository<Proy_User,Long> {
}
