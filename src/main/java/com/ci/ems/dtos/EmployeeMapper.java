package com.ci.ems.dtos;

import java.util.List;
import java.util.stream.Collectors;

import com.ci.ems.entities.Employee;

public class EmployeeMapper {
    // map Employee to EmployeeDTO
    public static EmployeeDto mapToEmployeeDTO(Employee employee){
        return new EmployeeDto(
                employee.getIdentifier(),
                employee.getName(),
                employee.getEmail(),
                employee.getBirthDate(),
                employee.getRole(),
                employee.getAddress(),
                employee.getDepartment(),
                employee.getMissions());  
    }
    
    // map List<Employee> to List<EmployeeDTO>
    public static List<EmployeeDto> mapEmployeeDTOs(List<Employee> employees){
        return employees.stream()
                        .map(EmployeeMapper::mapToEmployeeDTO)
                        .collect(Collectors.toList());
    }
}
