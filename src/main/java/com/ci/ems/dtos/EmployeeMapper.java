package com.ci.ems.dtos;

import java.util.List;
import java.util.stream.Collectors;

import com.ci.ems.entities.Employee;

public class EmployeeMapper {
    // map Employee to EmployeeDTO
    public static EmployeeDTO mapToEmployeeDTO(Employee employee){
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
    
    // map List<Employee> to List<EmployeeDTO>
    public static List<EmployeeDTO> mapEmployeeDTOs(List<Employee> employees){
        return employees.stream()
                        .map(EmployeeMapper::mapToEmployeeDTO)
                        .collect(Collectors.toList());
    }
}
