package com.ci.ems.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ci.ems.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{
    
}