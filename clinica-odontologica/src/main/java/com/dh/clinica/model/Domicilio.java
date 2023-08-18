package com.dh.clinica.model;

import lombok.Data;

import jakarta.persistence.*;

@Entity
@Table
@Data
public class Domicilio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String calle;
    private String numero;
    private String localidad;
    private String provincia;

}
