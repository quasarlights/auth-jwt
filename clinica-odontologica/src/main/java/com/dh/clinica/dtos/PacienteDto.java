package com.dh.clinica.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class PacienteDto {

    private Integer id;
    private String nombre;
    private String apellido;
    private String dni;

}
