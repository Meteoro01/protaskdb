package com.excercises.springdatajpa.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_usuario_proyecto")
public class Usuario_Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_user_proy;
    private Long id_user;
    private Long id_proy;
    private Boolean admin;
    private Boolean participante;
}
