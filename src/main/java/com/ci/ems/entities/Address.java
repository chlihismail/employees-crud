package com.ci.ems.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Address {
    @Id
    @GeneratedValue
    private Integer id;

    private String street;
    private String houseNb;
    private String zipCode;

    public Address(){}

    public Address(Integer id, String street, String houseNb, String zipCode) {
        this.id = id;
        this.street = street;
        this.houseNb = houseNb;
        this.zipCode = zipCode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNb() {
        return houseNb;
    }

    public void setHouseNb(String houseNb) {
        this.houseNb = houseNb;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    
}
