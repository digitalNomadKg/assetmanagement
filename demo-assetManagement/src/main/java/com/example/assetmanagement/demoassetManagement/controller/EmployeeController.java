package com.example.assetmanagement.demoassetManagement.controller;

import com.example.assetmanagement.demoassetManagement.assetmanagementrole.HttpResponse;
import com.example.assetmanagement.demoassetManagement.entity.Employee;
import com.example.assetmanagement.demoassetManagement.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    private EmployeeService employeeService;
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping("/getAllEmployees")
    public List<Employee> getEmployees() {
        logger.info("List of all users downloaded successfully");
        return employeeService.getAllEmployees();
    }

    @GetMapping("/getEmployee/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable("id") Long id) {
        Employee employee = employeeService.getEmployee(id);

        return new ResponseEntity<Employee>(employee, HttpStatus.OK);
    }

    @PostMapping("/addEmployee")
    public ResponseEntity<HttpResponse> addEmployee(@RequestBody Employee employee) {
        Employee newEmployee = employeeService.addEmployee(employee);
        logger.info("Employee: " + newEmployee.getFirstName() + " " + newEmployee.getLastName() + " has been added");
        return httpResponse(HttpStatus.CREATED, "Employee has been added");
    }

//    @PutMapping(path = "/{id}")
//    public ResponseEntity<HttpResponse> updateEmployee(@PathVariable("id") Long id, @RequestBody Employee employee) {
//        Employee updateEmployee = employeeService.updateEmployee(id, employee);
//        logger.info("Employee: " + updateEmployee.getFirstName() + " " + updateEmployee.getLastName() + " has been updated");
//        return httpResponse(HttpStatus.ACCEPTED, "Employee has been updated");
//    }


    @DeleteMapping(path = "/{id}")


    private ResponseEntity<HttpResponse> httpResponse(HttpStatus status, String notificationMessage) {
        return new ResponseEntity<>(new HttpResponse(status.value(), status, notificationMessage), status);

    }

}

