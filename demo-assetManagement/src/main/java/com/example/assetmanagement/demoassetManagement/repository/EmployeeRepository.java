package com.example.assetmanagement.demoassetManagement.repository;

import com.example.assetmanagement.demoassetManagement.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {




}
