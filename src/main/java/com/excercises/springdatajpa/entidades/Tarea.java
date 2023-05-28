package com.excercises.springdatajpa.entidades;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Entity
@Table(name = "tb_tarea")
public class Tarea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_tar;
    private String tit_tar;
    private String desc_tar;
    private LocalDateTime fec_cr_tar;
    private LocalDateTime fec_vn_tar;
    private int est_tar;
}