package com.ci.ems.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.ci.ems.entities.Department;
import com.ci.ems.repositories.DepartmentRepository;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    //save department
    public void addDepartment(@NonNull Department department){
        departmentRepository.save(department);
    }
}