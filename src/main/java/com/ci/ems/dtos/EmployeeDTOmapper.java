package com.ci.ems.dtos;

import com.ci.ems.entities.Employee;

public class EmployeeDTOmapper {
    public static Employee mapToEmployee(EmployeeDTO employeeDTO){
        Employee employee = new Employee();
        employee.setIdentifier(employeeDTO.identifier());
        employee.setName(employeeDTO.name());
        employee.setEmail(employeeDTO.email());
        employee.setBirthDate(employeeDTO.birthDate());
        employee.setRole(employeeDTO.role());
        employee.setAddress(employeeDTO.address());
        employee.setDepartment(employeeDTO.department());
        employee.setMissions(employeeDTO.missions());
        return employee;
    }
}
