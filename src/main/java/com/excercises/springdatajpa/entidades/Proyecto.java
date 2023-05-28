package com.excercises.springdatajpa.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_proyecto")
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_proy;
    private String desc_proy;
    private String titulo_proy;
    private int est_proy;
}
