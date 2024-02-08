package com.ci.ems.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ci.ems.dtos.EmployeeDto;
import com.ci.ems.services.EmployeeService;

import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    
    //Get employee by id
    @RequestMapping(method = RequestMethod.GET, value = "/employees/{id}")
    public EmployeeDto getEmployeeById(@PathVariable Integer id){
        if (id == null) {
            throw new IllegalArgumentException("id field cannot be empty");
        }
        try {
            return employeeService.getEmployeeById(id);
        } catch (Exception e) {
            System.out.println("Not found");
            return null;
        }
    }
    
    //Get all employees
    @RequestMapping(method = RequestMethod.GET, value = "/employees")
    public List<EmployeeDto> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
    
    //Post employee
    @RequestMapping(method = RequestMethod.POST, value = "/employees")
    public void addEmployee(@RequestBody EmployeeDto employeeDto){
        if(employeeDto == null){
            throw new IllegalArgumentException("Json object cannot be empty");
        }
        try {
            
            employeeService.addEmployee(employeeDto);
        } catch (Exception e) {
            System.out.println("Something failed in the process");
        }
    }

    // Update Course
    @RequestMapping(method = RequestMethod.PUT, value = "/employees/{id}")
    public void updateEmployee(@PathVariable Integer id, @RequestBody EmployeeDto employeeDto){
        if(employeeDto == null || id == null){
            throw new IllegalArgumentException("empty field");
        }
        try {
            employeeService.updateEmployee(id, employeeDto);
        } catch (Exception e) {
            System.out.println("Something failed in the process");
        }
    }

    //Delete employee
    @RequestMapping(method = RequestMethod.DELETE, value = "employees/{id}")
    public void deleteEmployee(@PathVariable Integer id){
        if(id == null){
            throw new IllegalArgumentException("id field cannot be empty");
        }
        try {
            employeeService.deleteEmployee(id);
        } catch (Exception e) {
            System.out.println("Something failed in the process");
        }
    }
}