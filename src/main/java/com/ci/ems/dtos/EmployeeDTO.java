package com.ci.ems.dtos;

import java.time.LocalDate;
import java.util.List;

import com.ci.ems.entities.Address;
import com.ci.ems.entities.Department;
import com.ci.ems.entities.EmployeeRole;
import com.ci.ems.entities.Mission;

public class EmployeeDTO {
    private String identifier;
    private String name;
    private String email;
    private LocalDate birthDate;
    private EmployeeRole role;
    private Address address;
    private Department department;
    private List<Mission> missions;

    public EmployeeDTO(){ super(); }

    public EmployeeDTO(String identifier, String name, String email, LocalDate birthDate, EmployeeRole role,
            Address address, Department department, List<Mission> missions) {
        this.identifier = identifier;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
        this.role = role;
        this.address = address;
        this.department = department;
        this.missions = missions;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public EmployeeRole getRole() {
        return role;
    }

    public void setRole(EmployeeRole role) {
        this.role = role;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Mission> getMissions() {
        return missions;
    }

    public void setMissions(List<Mission> missions) {
        this.missions = missions;
    }
    
}
