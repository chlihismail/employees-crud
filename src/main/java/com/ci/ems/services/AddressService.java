package com.ci.ems.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.ci.ems.entities.Address;
import com.ci.ems.repositories.AddressRepository;

@Service
public class AddressService{
    @Autowired
    private AddressRepository addressRepository;

    //save address
    public void addAddress(@NonNull Address address){
        addressRepository.save(address);
    }
}