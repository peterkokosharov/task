package com.callflow.task.service;

import com.callflow.task.dto.StarDTORequest;
import com.callflow.task.model.Galaxy;
import com.callflow.task.model.Star;
import com.callflow.task.repository.GalaxyRepository;
import com.callflow.task.repository.StarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StarServiceImpl implements StarService {
    @Autowired
    GalaxyRepository galaxyRepo;

    @Autowired
    StarRepository starRepo;
    @Override
    public boolean addStar(StarDTORequest starDto) throws Exception {
        Galaxy galaxy = galaxyRepo.findByName(starDto.getGalaxyName());
        if (galaxy == null) {
            throw new Exception("NoGalaxy");
        }

        Star star = starRepo.findByName(starDto.getName());
        if(star != null) {
            return false;
        }

        star = new Star();
        star.setGalaxy(galaxy);
        star.setName(starDto.getName());
        star.setLight(starDto.getLight());
        star.setMass(starDto.getMass());
        star.setSize(starDto.getSize());
        star.setTemperatura(starDto.getTemperatura());

        starRepo.save(star);
        return true;
    }

}