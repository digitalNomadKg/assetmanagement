package com.example.assetmanagement.demoassetManagement.service;

import com.example.assetmanagement.demoassetManagement.entity.Employee;
import com.example.assetmanagement.demoassetManagement.repository.EmployeeRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Component

public class EmployeeService {

    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {

            return employeeRepository.findAll();
    }

    public Employee getEmployee(Long id) {
        return employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee with such ID not found, please check once"));
    }

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

//    public Employee updateEmployee(Long id, Employee employee) {
//        return employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("No employee found, please check"));
//    }


//    public ResponseEntity<Object>  deleteEmployee(){
//        return employeeRepository.deleteById(id);
//    }

//
//    public Employee deleteEmployee(Long id, Employee employee){
//        return employeeRepository.delete(getEmployee(id));
//
//    }

}

