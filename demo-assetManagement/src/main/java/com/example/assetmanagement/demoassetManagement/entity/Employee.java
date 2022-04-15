package com.example.assetmanagement.demoassetManagement.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "EMPLOYEE")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Column(name = "id", unique = true, updatable = false)
    private Long id;

    @NotNull
    @Column(name = "document", unique = true)
    private String documentId;

    @NotNull
    @Column(name = "employeeDocumentType", unique = true)
    private String employeeDocumentType;

    @NotNull
    @Column(name = "firstName", unique = true)
    private String firstName;

    @NotNull
    @Column(name = "lastName", unique = true)
    private String lastName;

    @NotNull
    @Column(name = "phone", unique = true)
    private int phone;

    @NotNull
    @Column(name = "email", unique = true)
    private String email;

    @NotNull
    @Column(name = "birthDate", unique = true)
    private String birthDate;

    @NotNull
    @Column(name = "citizenship")
    private String citizenship;

    @Column(name = "gender")
    private String gender;

    @Column(name = "businessUnitName")
    private String businessUnitName;

    @Column(name = "teamName")
    private String teamName;

    @Column(name = "employeeType ")
    private String employeeType;

    @Column(name = "startDate")
    private String startDate;

    @Column(name = "endDate")
    private String endDate;

    @Column(name = "jobTitle")
    private String jobTitle;

    @Column(name = "jobLevel")
    private String jobLevel;

    @Column(name = "jobLevelIndicator")
    private int jobLevelIndicator;

    @Column(name = "workingHours")
    private String workingHours;

    @Column(name = "costCenter")
    private String costCenter;

    @Column(name = "salary")
    private double salary;

    @Column(name = "educationLevel")
    private String educationLevel;

    @Column(name = "certifications")
    private String certifications;

    @Column(name = "riskOfLoss")
    private String riskOfLoss;

    @Column(name = "readinessForPromotion")
    private String readinessForPromotion;

    @Column(name = "probationPeriod")
    private String probationPeriod;

    @Column(name = "disabilityStatus")
    private String disabilityStatus;

    @Column(name = "workPlace")
    private String workPlace;

    @Column(name = "contractDueDate")
    private String contractDueDate;

    @Column(name = "referral")
    private String referral;

    @Column(name = "hobbyGroup")
    private String hobbyGroup;

    @Column(name = "userPic")
    private String userPic;

    @Column(name = "notes")
    private String notes;
}
