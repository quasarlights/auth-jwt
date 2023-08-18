package com.dh.clinica.model;

import lombok.Data;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "turnos")
@Data
public class Turno {

    @Id
    @SequenceGenerator(name = "turno_sequence", sequenceName = "turno_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "turno_sequence")
    private Long id;


    @ManyToOne()
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;


    @ManyToOne()
    @JoinColumn(name = "odontologo_id")
    private Odontologo odontologo;
    private Date date;

}
