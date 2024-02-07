package com.ci.ems.dtos;

import java.time.LocalDate;
import java.util.List;

import com.ci.ems.entities.Address;
import com.ci.ems.entities.Department;
import com.ci.ems.entities.EmployeeRole;
import com.ci.ems.entities.Mission;

public record EmployeeDto(
    String identifier,
    String name,
    String email,
    LocalDate birthDate,
    EmployeeRole role,
    Address address,
    Department department,
    List<Mission> missions
    ){}
