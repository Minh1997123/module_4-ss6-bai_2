package com.example.patientservice.controller;

import com.example.patientservice.model.entity.Patient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientsController {

    @PostMapping("/api/v1/patients")
    public Patient createPatient(@RequestBody Patient patient) {
        return patient;
    }
}
