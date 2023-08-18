package com.dh.clinica.service;

import com.dh.clinica.model.Odontologo;
import com.dh.clinica.model.Paciente;
import com.dh.clinica.model.Turno;
import com.dh.clinica.repository.impl.TurnoRepository;
import com.sun.jdi.PrimitiveValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TurnoService {

    @Autowired
    private TurnoRepository turnoRepository;

    @Autowired
    private OdontologoService odontologoService;

    @Autowired
    private PacienteService pacienteService;

    public Turno registrarTurno(Turno turno){
        return turnoRepository.save(turno);
    }
    public List<Turno> listar(){
        return turnoRepository.findAll();
    }
    public void eliminar(Long id){
        turnoRepository.deleteById(id);
    }
    public Turno actualizar(Turno turno){
        Paciente p = pacienteService.buscar(turno.getPaciente().getId()).get();
        Odontologo o = odontologoService.buscar(turno.getOdontologo().getId()).get();
        turno.setPaciente(p);
        turno.setOdontologo(o);
        return turnoRepository.save(turno);
    }
    public Optional<Turno> buscar(Long id){
        return turnoRepository.findById(id);
    }

}
