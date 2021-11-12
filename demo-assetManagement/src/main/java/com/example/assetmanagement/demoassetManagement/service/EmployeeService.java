package com.example.assetmanagement.demoassetManagement.service;

import com.example.assetmanagement.demoassetManagement.entity.Employee;
import com.example.assetmanagement.demoassetManagement.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }
}

