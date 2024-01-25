package com.ci.ems.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Mission {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;
    private Integer duration;

    @ManyToMany(mappedBy = "missions")
    private List<Employee> employees;
    
    public Mission(){}

    public Mission(Integer id, String name, Integer duration) {
        this.id = id;
        this.name = name;
        this.duration = duration;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
    
}
