package com.callflow.task.service;

import com.callflow.task.dto.PlanetDTORequest;
import com.callflow.task.model.Planet;
import com.callflow.task.model.Star;
import com.callflow.task.repository.PlanetRepository;
import com.callflow.task.repository.StarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanetServiceImpl implements PlanetService {
    @Autowired
    StarRepository starRepo;

    @Autowired
    PlanetRepository planetRepo;

    @Override
    public boolean addPlanet(PlanetDTORequest planetDto) throws Exception {
        Star star =  starRepo.findByName(planetDto.getStarName());
        if(star==null){
            throw new Exception("NoStar");
        }
        Planet planet = planetRepo.findByName(planetDto.getName());
        if(planet != null) {
            return false;
        }

        planet = new Planet();
        planet.setName(planetDto.getName());
        planet.setHabblit(planetDto.getHabblit());
        planet.setPlanetType(planetDto.getPlanetType());

        planet.setStar(star);
        planetRepo.save(planet);

        return true;
    }
}
