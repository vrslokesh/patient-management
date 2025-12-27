package com.patientservice.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //TODO check for better approach not got for Production go for UUID Generation Type
    private UUID patientId;


    @NotNull
    private String patientName;

    @Email
    @NotNull
    private String patientEmail;


    @NotNull
    private LocalDate dateOfBirth;

    @NotNull
    private LocalDateTime createdAt;

    @Version
    private Long version;
}
