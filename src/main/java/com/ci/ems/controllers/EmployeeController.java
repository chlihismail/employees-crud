package com.ci.ems.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ci.ems.dtos.EmployeeDTO;
import com.ci.ems.entities.Employee;
import com.ci.ems.services.EmployeeService;

import io.micrometer.common.lang.NonNull;

import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    
    //Get employee by id
    @RequestMapping(method = RequestMethod.GET, value = "/employees/{id}")
    public EmployeeDTO getEmployeeById(@PathVariable Integer id){
        if(id != null){
            return employeeService.getEmployeeById(id);
        }else{ return null; }
    }
    
    //Get all employees
    @RequestMapping(method = RequestMethod.GET, value = "/employees")
    public List<EmployeeDTO> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
    
    //Post employee
    @RequestMapping(method = RequestMethod.POST, value = "/employees")
    public void addEmployee(@RequestBody EmployeeDTO employeeDTO){
        if(employeeDTO != null){
            employeeService.addEmployee(employeeDTO);
        }else{ return; }
    }

    // // Update Course
    // @RequestMapping(method = RequestMethod.PUT, value = "/employees/{id}")
    // public void updateEmployee(@RequestBody EmployeeDTO employeeDTO, @PathVariable Integer id){
    //     if(employeeDTO != null && id != null){
    //         employeeService.updateEmployee(id, employeeDTO);
    //     }else{ return; }
    // }

    //Delete employee
    @RequestMapping(method = RequestMethod.DELETE, value = "employees/{id}")
    public void deleteEmployee(@PathVariable Integer id){
        if(id != null){
            employeeService.deleteEmployee(id);
        }else{ return; }
    }
}