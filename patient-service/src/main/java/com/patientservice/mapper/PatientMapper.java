package com.patientservice.mapper;

import com.patientservice.dto.PatientResponseDTO;
import com.patientservice.model.Patient;

public class PatientMapper {

    public static PatientResponseDTO toDTO(Patient patient) {

        return PatientResponseDTO.builder().
                patientId(patient.getPatientId().toString())
                .patientName(patient.getPatientName())
                .patientEmail(patient.getPatientEmail())
                .dateOfBirth(patient.getDateOfBirth().toString())
                .build();
    }
}
