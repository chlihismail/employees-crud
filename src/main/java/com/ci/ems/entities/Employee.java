package com.ci.ems.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private Integer id;

    @Column( nullable = false, unique = true )
    private String identifier;
    @Column( nullable = false )
    private String name;
    @Column( nullable = false, unique = true )
    private String email;
    @Column( nullable = false )
    private LocalDate birthDate;

    @Enumerated(EnumType.STRING)
    @Column( nullable = false )
    private EmployeeRole role;

    @OneToOne(
        orphanRemoval = true,
        cascade = CascadeType.ALL
    )
    @JoinColumn(name = "address_id")
    private Address address;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id")
    private Department department;

    @ManyToMany(
        cascade = {
        CascadeType.PERSIST,
        CascadeType.MERGE
        }
    )
    @JoinTable(
        name = "employee_mission",
        joinColumns = @JoinColumn(name = "employee_id"),
        inverseJoinColumns = @JoinColumn(name = "mission_id")
    )
    private List<Mission> missions;

    public Employee(){}
    public Employee(Integer id, String identifier, String name, String email, LocalDate birthDate, EmployeeRole role) {
        this.id = id;
        this.identifier = identifier;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
        this.role = role;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getIdentifier(){
        return identifier;
    }
    public void setIdentifier(String identifier){
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
