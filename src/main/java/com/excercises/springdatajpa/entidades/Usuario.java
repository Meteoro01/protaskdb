package com.excercises.springdatajpa.entidades;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "tb_usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_user;
    private String clave_user;
    private String name_user;
    private String cor_user;
    private LocalDateTime fec_cr_user;

}
