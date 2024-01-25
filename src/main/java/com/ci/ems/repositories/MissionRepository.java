package com.ci.ems.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ci.ems.entities.Mission;

public interface MissionRepository extends JpaRepository<Mission, Integer>{
    
}