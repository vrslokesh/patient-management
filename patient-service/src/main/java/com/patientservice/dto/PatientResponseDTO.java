package com.patientservice.dto;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PatientResponseDTO {

    private String patientId;
    private String patientName;
    private String patientEmail;
    private String dateOfBirth;
}
