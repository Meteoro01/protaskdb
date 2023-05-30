package com.excercises.springdatajpa.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_proy_user_tar")
public class Proy_User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_put;
    private Long id_user;
    private Long id_proy;
    private Long id_tar;
    private String descripcion;
}
