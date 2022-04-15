package com.example.assetmanagement.demoassetManagement.service;

import com.example.assetmanagement.demoassetManagement.entity.Employee;
import com.example.assetmanagement.demoassetManagement.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor

@Component
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public void getEmployee(Long id) {
        employeeRepository.findById(id);
    }

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

//    public Employee updateEmployee(Long id, Employee employee) {
//        return employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("No employee found, please check"));
//    }


    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

//
//    public Employee deleteEmployee(Long id, Employee employee){
//        return employeeRepository.delete(getEmployee(id));
//
//    }

}

