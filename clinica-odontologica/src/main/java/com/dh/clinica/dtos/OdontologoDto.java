package com.dh.clinica.dtos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class OdontologoDto {

    private Integer id;
    private String nombre;
    private String apellido;
    private Integer matricula;
}
