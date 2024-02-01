package com.ci.ems.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.ci.ems.dtos.EmployeeDTO;
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

    //Get employee by id
    public EmployeeDTO getEmployeeById(@NonNull Integer id){
        Employee employee = employeeRepository.findById(id).orElse(null);
        return convertToDTO(employee);
    }

    //Get all employees
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    //Could use a mapper class
    private EmployeeDTO convertToDTO(Employee employee){
        EmployeeDTO employeeDTO = new EmployeeDTO(
            employee.getIdentifier(),
            employee.getName(),
            employee.getEmail(),
            employee.getBirthDate(),
            employee.getRole(),
            employee.getAddress(),
            employee.getDepartment(),
            employee.getMissions()
        );
        return employeeDTO;

    }
    
    // private Employee convertToEmployee(EmployeeDTO employeeDTO){}

}