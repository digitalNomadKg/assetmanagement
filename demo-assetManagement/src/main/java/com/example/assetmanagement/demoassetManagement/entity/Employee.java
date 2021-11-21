package com.example.assetmanagement.demoassetManagement.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name="id", nullable = false, updatable = false)
    private Long id;

    private String title, firstName, lastName, gender,
            email, department, position, entryDate, leavingDate, reportingManager;
    private int telephone;
}

