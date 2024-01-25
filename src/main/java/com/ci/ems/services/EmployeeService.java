package com.ci.ems.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.ci.ems.entities.Employee;
import com.ci.ems.repositories.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    //Save employees
    public void addEmployee(@NonNull Employee employee){
        employeeRepository.save(employee);
    }

    //Get all employees
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
}