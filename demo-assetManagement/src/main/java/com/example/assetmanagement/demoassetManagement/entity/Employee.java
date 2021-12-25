package com.example.assetmanagement.demoassetManagement.entity;

import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "employeeDocumentType")
    private String employeeDocumentType;

    @Column(name = "documentNumber", unique = true, updatable = false)
    private final Long documentNumber;

    @Column(name = "firstName", unique = true)
    private String firstName;

    @Column(name = "lastName", unique = true)
    private String lastName;

    @Column(name = "phone", unique = true)
    private int phone;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "gender")
    private String gender;

    @Column(name = "birthDate")
    private String birthDate;

    @Column(name = "citizenship")
    private String citizenship;

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

    @Column(name = "riskOfloss")
    private String riskOfloss;

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

    public Employee(String employeeDocumentType, Long documentNumber, String firstName,
                    String lastName, int phone, String email, String gender, String birthDate,
                    String citizenship, String businessUnitName, String teamName, String employeeType,
                    String startDate, String endDate, String jobTitle, String jobLevel, int jobLevelIndicator,
                    String workingHours, String costCenter, double salary, String educationLevel, String certifications,
                    String riskOfloss, String readinessForPromotion, String probationPeriod, String disabilityStatus,
                    String workPlace, String contractDueDate, String referral, String hobbyGroup, String userPic, String notes) {
        this.employeeDocumentType = employeeDocumentType;
        this.documentNumber = documentNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.birthDate = birthDate;
        this.citizenship = citizenship;
        this.businessUnitName = businessUnitName;
        this.teamName = teamName;
        this.employeeType = employeeType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.jobTitle = jobTitle;
        this.jobLevel = jobLevel;
        this.jobLevelIndicator = jobLevelIndicator;
        this.workingHours = workingHours;
        this.costCenter = costCenter;
        this.salary = salary;
        this.educationLevel = educationLevel;
        this.certifications = certifications;
        this.riskOfloss = riskOfloss;
        this.readinessForPromotion = readinessForPromotion;
        this.probationPeriod = probationPeriod;
        this.disabilityStatus = disabilityStatus;
        this.workPlace = workPlace;
        this.contractDueDate = contractDueDate;
        this.referral = referral;
        this.hobbyGroup = hobbyGroup;
        this.userPic = userPic;
        this.notes = notes;
    }

    public Long getDocumentNumber() {
        return documentNumber;
    }

    public String getEmployeeDocumentType() {
        return employeeDocumentType;
    }

    public void setEmployeeDocumentType(String employeeDocumentType) {
        this.employeeDocumentType = employeeDocumentType;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getBusinessUnitName() {
        return businessUnitName;
    }

    public void setBusinessUnitName(String businessUnitName) {
        this.businessUnitName = businessUnitName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(String jobLevel) {
        this.jobLevel = jobLevel;
    }

    public int getJobLevelIndicator() {
        return jobLevelIndicator;
    }

    public void setJobLevelIndicator(int jobLevelIndicator) {
        this.jobLevelIndicator = jobLevelIndicator;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }

    public String getCostCenter() {
        return costCenter;
    }

    public void setCostCenter(String costCenter) {
        this.costCenter = costCenter;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getCertifications() {
        return certifications;
    }

    public void setCertifications(String certifications) {
        this.certifications = certifications;
    }

    public String getRiskOfloss() {
        return riskOfloss;
    }

    public void setRiskOfloss(String riskOfloss) {
        this.riskOfloss = riskOfloss;
    }

    public String getReadinessForPromotion() {
        return readinessForPromotion;
    }

    public void setReadinessForPromotion(String readinessForPromotion) {
        this.readinessForPromotion = readinessForPromotion;
    }

    public String getProbationPeriod() {
        return probationPeriod;
    }

    public void setProbationPeriod(String probationPeriod) {
        this.probationPeriod = probationPeriod;
    }

    public String getDisabilityStatus() {
        return disabilityStatus;
    }

    public void setDisabilityStatus(String disabilityStatus) {
        this.disabilityStatus = disabilityStatus;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public String getContractDueDate() {
        return contractDueDate;
    }

    public void setContractDueDate(String contractDueDate) {
        this.contractDueDate = contractDueDate;
    }

    public String getReferral() {
        return referral;
    }

    public void setReferral(String referral) {
        this.referral = referral;
    }

    public String getHobbyGroup() {
        return hobbyGroup;
    }

    public void setHobbyGroup(String hobbyGroup) {
        this.hobbyGroup = hobbyGroup;
    }

    public String getUserPic() {
        return userPic;
    }

    public void setUserPic(String userPic) {
        this.userPic = userPic;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}

