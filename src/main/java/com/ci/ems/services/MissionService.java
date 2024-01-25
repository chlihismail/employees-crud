package com.ci.ems.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.ci.ems.entities.Mission;
import com.ci.ems.repositories.MissionRepository;

@Service
public class MissionService {
    @Autowired
    private MissionRepository missionRepository;

    //save mission
    public void addMission(@NonNull Mission mission){
        missionRepository.save(mission);
    }
}