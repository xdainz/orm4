package com.hospital.orm4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.orm4.model.Paciente;
import com.hospital.orm4.repository.PacienteRepository;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    public List<Paciente> findAll(){
        return pacienteRepository.findAll();
    }
    
    public Paciente save(Paciente paciente){
        return pacienteRepository.save(paciente);
    }

    public Boolean existsById(int id){
        return pacienteRepository.existsById(id);
    }
}
