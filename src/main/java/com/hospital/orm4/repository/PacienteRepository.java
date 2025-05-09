package com.hospital.orm4.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.orm4.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long>{
    
    List<Paciente> findAll();
    
    @SuppressWarnings("unchecked")
    Paciente save(Paciente paciente);
    
    Boolean existsById(int id);
}
