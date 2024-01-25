package com.ci.ems.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ci.ems.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    
}