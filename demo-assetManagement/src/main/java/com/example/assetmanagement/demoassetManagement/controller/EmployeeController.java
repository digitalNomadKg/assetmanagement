package com.example.assetmanagement.demoassetManagement.controller;

import com.example.assetmanagement.demoassetManagement.assetmanagementrole.HttpResponse;
import com.example.assetmanagement.demoassetManagement.entity.Employee;
import com.example.assetmanagement.demoassetManagement.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;
    private final Logger logger = LoggerFactory.getLogger(getClass());


    @GetMapping
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @GetMapping(path = "/{id}",
            consumes = {
                    MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE}
    )
    public ResponseEntity<Employee> getEmployee(@PathVariable("id") Long id) {
        Employee employee = employeeService.getEmployee(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<HttpResponse> addEmployee(@RequestBody Employee employee) {
        Employee newEmployee = employeeService.addEmployee(employee);
        logger.info("Employee: " + newEmployee.getFirstName() + " " + newEmployee.getLastName() + " has been added");
        return httpResponse(HttpStatus.CREATED, "Employee has been added");
    }


    @PutMapping(path = "/{id}",
            consumes = {
                    MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE}
    )
    public ResponseEntity<HttpResponse> updateEmployee(@PathVariable("id") Long id, @RequestBody Employee employee) {
        Employee updateEmployee = employeeService.updateEmployee(id , employee);
        logger.info("Employee: " + updateEmployee.getFirstName() + " " + updateEmployee.getLastName() + " has been updated");
        return httpResponse(HttpStatus.ACCEPTED, "Employee has been updated");
    }

    private ResponseEntity<HttpResponse> httpResponse(HttpStatus status, String notificationMessage) {
        return new ResponseEntity<>(new HttpResponse(status.value(), status, notificationMessage),
                status);

    }

}

