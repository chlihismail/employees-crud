package com.ci.ems.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ci.ems.entities.Employee;
import com.ci.ems.services.EmployeeService;

import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    //Post employees
    @RequestMapping(method = RequestMethod.POST, value = "/employees")
    public void addEmployee(@RequestBody Employee employee){
        if(employee != null){
            employeeService.addEmployee(employee);
        }else{ return; }
    }

    //Get all employees
    @RequestMapping(method = RequestMethod.GET, value = "/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
    
}