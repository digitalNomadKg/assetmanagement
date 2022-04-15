package com.example.assetmanagement.demoassetManagement;

import com.example.assetmanagement.demoassetManagement.entity.Employee;
import com.example.assetmanagement.demoassetManagement.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@RequiredArgsConstructor

@SpringBootTest
class DemoAssetManagementApplicationTests {

    private final EmployeeService employeeService;

    @Test
    public void testAdd() {
        Employee employee = new Employee();
        employee.setId(1L);
        employee.setEmail("");
        employee.setDocumentId("");
        employee.setBirthDate("");
        employee.setBusinessUnitName("");
        employee.setCertifications("");
        employee.setCitizenship("");
        employee.setContractDueDate("");
        employee.setCostCenter("");
        employee.setDisabilityStatus("");
        employee.setEducationLevel("");
        employee.setEmployeeDocumentType("");
        employee.setEmployeeType("");
        employee.setEndDate("");
        employee.setFirstName("");
        employee.setGender("");
        employee.setHobbyGroup("");
        employee.setJobLevel("");
        employee.setJobLevelIndicator(1);
        employee.setJobTitle("");
        employee.setLastName("");
        employee.setNotes("");
        employee.setPhone(123);
        employee.setProbationPeriod("");
        employee.setReadinessForPromotion("");
        employee.setReferral("");
        employee.setRiskOfLoss("");
        employee.setSalary(12.2);
        employee.setStartDate("");
        employee.setTeamName("");
        employee.setUserPic("");
        employee.setWorkingHours("");
        employee.setWorkPlace("");
        assertNotNull(employeeService.addEmployee(employee));
    }
}
