package com.patientservice.controller;

import com.patientservice.dto.PatientResponseDTO;
import com.patientservice.model.Patient;
import com.patientservice.service.PatientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/patientDetails")
    public List<PatientResponseDTO> getPatientDetails(){
       return patientService.patientsList();
    }
}
