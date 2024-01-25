package com.ci.ems.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ci.ems.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
    
}