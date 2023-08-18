package com.dh.clinica.dtos;

import com.dh.clinica.model.Odontologo;
import com.dh.clinica.model.Paciente;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import jakarta.persistence.*;

import java.util.Date;

@Setter
@Getter
@ToString
public class TurnoDto {

    private Long id;
    private Paciente paciente;

    @JsonProperty("odontologo")
    private OdontologoDto odontologoDto;
    private Date date;
}
