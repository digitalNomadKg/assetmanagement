package com.example.assetmanagement.demoassetManagement.controller;


import com.example.assetmanagement.demoassetManagement.entity.Employee;
import com.example.assetmanagement.demoassetManagement.service.EmployeeService;
import com.example.assetmanagement.demoassetManagement.assetmanagementrole.HttpResponse;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
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

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable("id") Long id) {
        Employee employee = employeeService.getEmployee(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

//    public Employee getEmployee(@PathVariable Long id) {
//        return employeeService.getEmployee(id);
//    }

//    @PostMapping
////    public ResponseEntity<HttpResponse> addEmployee(@RequestBody Employee employee) {
////        Employee newEmployee = employeeService.addEmployee(employee);
////        logger.info("Employee: " + newEmployee.getFirstName() + " " + newEmployee.getLastName() + " has been added");
////        return httpResponse(HttpStatus.CREATED, "Employee has been added");
////    }
////
////    private ResponseEntity<HttpResponse> httpResponse(HttpStatus status, String notificationMessage) {
////        return new ResponseEntity<>(
////                new HttpResponse(status.value(), status, notificationMessage),
////                status);
////    }
//
//
////    public Long addEmployee(@RequestBody Employee employee) {
////        return employeeService.addEmployee(employee);
////    }

}

