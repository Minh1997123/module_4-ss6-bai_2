package com.example.patientservice.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Patient {
    @Id
    private Long id;
    private String fullName ;
    private LocalDateTime dateOfBirth ;
    private String gender;
    private String phoneNumber;
    private String address;
    private String medicalHistory;
}
