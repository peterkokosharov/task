package com.callflow.task.service;

import com.callflow.task.dto.MoonDTORequest;
import com.callflow.task.model.Moon;
import com.callflow.task.model.Planet;
import com.callflow.task.repository.MoonRepository;
import com.callflow.task.repository.PlanetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MoonServiceImpl implements MoonService {

    @Autowired
    PlanetRepository planetRepo;
    @Autowired
    MoonRepository moonRepo;

    @Override
    public boolean addMoon(MoonDTORequest moonDto) throws Exception {
        Planet planet = planetRepo.findByName(moonDto.getPlanetName());
        if(planet == null){
            throw new Exception("NoPlanet");
        }

        Moon moon = moonRepo.findByName(moonDto.getName());
        if(moon != null) {
            return false;
        }

        moon = new Moon();
        moon.setName( moon.getName() );
        moon.setPlanet(planet);

        moonRepo.save(moon);

        return true;
    }
}
