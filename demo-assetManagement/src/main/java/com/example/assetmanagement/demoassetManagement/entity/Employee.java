package com.example.assetmanagement.demoassetManagement.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue
    private Long id;
    private String title, firstName, lastName, gender,
            email, department, position,
            entryDate, leavingDate, reportingManager;
    private int telephone;
}

