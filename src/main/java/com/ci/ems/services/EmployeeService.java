package com.ci.ems.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.ci.ems.dtos.EmployeeDTO;
import com.ci.ems.dtos.EmployeeDTOmapper;
import com.ci.ems.dtos.EmployeeMapper;
import com.ci.ems.entities.Employee;
import com.ci.ems.repositories.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    // Get employee by id
    public EmployeeDTO getEmployeeById(@NonNull Integer id){
         return EmployeeMapper.mapToEmployeeDTO(employeeRepository.findById(id).orElse(null));
    }
    
    // Get all employees
    public List<EmployeeDTO> getAllEmployees(){
        return EmployeeMapper.mapEmployeeDTOs(employeeRepository.findAll());
    }
    
    // Save employee
    public void addEmployee(EmployeeDTO employeeDTO){
        if (employeeDTO != null) {
            employeeRepository.save(EmployeeDTOmapper.mapToEmployee(employeeDTO));
        }else{return;}
    }

    // // Update employee
    // public void updateEmployee(Integer id, EmployeeDTO employeeDTO){
    //     if (employeeDTO != null) {
    //         employeeRepository.save(EmployeeDTOmapper.mapToEmployee(employeeDTO));
    //     }else{return;}
    // }
    
    // delete employee
    public void deleteEmployee(@NonNull Integer id){
        employeeRepository.deleteById(id);
    }
}