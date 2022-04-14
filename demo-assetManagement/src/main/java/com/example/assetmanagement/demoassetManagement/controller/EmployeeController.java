package com.example.assetmanagement.demoassetManagement.controller;

import com.example.assetmanagement.demoassetManagement.entity.Employee;
import com.example.assetmanagement.demoassetManagement.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<List<Employee>> getAll() {
        try {
            List<Employee> employeeList = employeeService.getAllEmployees();
            if (employeeList.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(employeeList, HttpStatus.OK);

        } catch (Exception exception) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> get(@PathVariable("id") Long id) {
        try {
            employeeService.getEmployee(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception exception) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<Employee> add(@RequestBody Employee employee) {
        try {
            return new ResponseEntity<>(employeeService.addEmployee(employee), HttpStatus.CREATED);
        } catch (Exception exception) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }


//    @PutMapping(path = "/{id}")
//    public ResponseEntity<HttpResponse> updateEmployee(@PathVariable("id") Long id, @RequestBody Employee employee) {
//        Employee updateEmployee = employeeService.updateEmployee(id, employee);
//        logger.info("Employee: " + updateEmployee.getFirstName() + " " + updateEmployee.getLastName() + " has been updated");
//        return httpResponse(HttpStatus.ACCEPTED, "Employee has been updated");
//    }


}

