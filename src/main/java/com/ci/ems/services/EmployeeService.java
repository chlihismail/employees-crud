package com.ci.ems.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.ci.ems.dtos.EmployeeDto;
import com.ci.ems.dtos.EmployeeDtoMapper;
import com.ci.ems.dtos.EmployeeMapper;
import com.ci.ems.entities.Employee;
import com.ci.ems.repositories.EmployeeRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    // Get employee by id
    public EmployeeDto getEmployeeById(@NonNull Integer id){
         return EmployeeMapper.mapToEmployeeDTO(employeeRepository.findById(id).orElse(null));
    }
    
    // Get all employees
    public List<EmployeeDto> getAllEmployees(){
        return EmployeeMapper.mapEmployeeDTOs(employeeRepository.findAll());
    }
    
    // Save employee
    public void addEmployee(EmployeeDto employeeDto){
        Employee employee = EmployeeDtoMapper.mapToEmployee(employeeDto);
        if (employee == null) {
            throw new IllegalArgumentException("empty object");
        }
        try {
            employeeRepository.save(employee);
        } catch (Exception e) {
            System.out.println("Something failed in the process");
        }
    }

    // Update employee
    public void updateEmployee(@NonNull Integer id, EmployeeDto employeeDto){
        Employee employee = EmployeeDtoMapper.mapToEmployee(employeeDto);
        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
            if (optionalEmployee.isPresent()) {
                Employee existingEmployee = optionalEmployee.get();
                existingEmployee.setIdentifier(employee.getIdentifier());
                existingEmployee.setName(employee.getName());
                existingEmployee.setEmail(employee.getEmail());
                existingEmployee.setBirthDate(employee.getBirthDate());
                existingEmployee.setRole(employee.getRole());
                existingEmployee.setAddress(employee.getAddress());
                existingEmployee.setDepartment(employee.getDepartment());
                existingEmployee.setMissions(employee.getMissions());

                employeeRepository.save(existingEmployee);
            }else{
                throw new EntityNotFoundException("Employee not found for id: "+id);
            }
    }
    
    // delete employee
    public void deleteEmployee(@NonNull Integer id){
        employeeRepository.deleteById(id);
    }
}