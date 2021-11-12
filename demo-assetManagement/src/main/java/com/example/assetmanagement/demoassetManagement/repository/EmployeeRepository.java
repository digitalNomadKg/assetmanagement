package com.example.assetmanagement.demoassetManagement.repository;

import com.example.assetmanagement.demoassetManagement.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
