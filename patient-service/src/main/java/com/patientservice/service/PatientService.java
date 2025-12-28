package com.patientservice.service;

import com.patientservice.dto.PatientResponseDTO;
import com.patientservice.mapper.PatientMapper;
import com.patientservice.model.Patient;
import com.patientservice.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<PatientResponseDTO> patientsList() {

        List<Patient> patientDetails = patientRepository.findAll();
   /*     List<PatientResponseDTO> patientRequiredDetails = patientDetails.stream()
                .map(patient -> PatientMapper.toDTO(patient)).toList();*/
        return patientDetails.stream()
                .map(PatientMapper::toDTO).toList();
    }
}
