package com.callflow.task.service;

import com.callflow.task.dto.*;
import com.callflow.task.model.*;
import com.callflow.task.repository.GalaxyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GalaxyServiceImpl implements GalaxyService{

    @Autowired
    GalaxyRepository repository;

    @Override
    public boolean addGalaxy(GalaxyDTORequest galaxyDto) throws Exception {
        Galaxy entry = repository.findByName(galaxyDto.getName());
        if(entry != null)
            return false;
        else {
            entry = new Galaxy();
            entry.setName(galaxyDto.getName());
            entry.setAge(galaxyDto.getAge());
            entry.setAgeType(galaxyDto.getAgeType());
            entry.setGalaxyType(galaxyDto.getGalaxyType());

            repository.save(entry);
        }
        return true;
    }

    @Override
    public CatalogDTOResponse getGalaxies() throws Exception {
        List<GalaxyDTOResponse> allGalaxies = new ArrayList<>();
        for(Galaxy e: repository.findAll()){
            GalaxyDTOResponse dto = mapFromEntry(e);
            allGalaxies.add(dto);
        }

        CatalogDTOResponse resp = new CatalogDTOResponse();
        resp.setGalaxies(allGalaxies);
        return resp;
    }

    private MoonDTO mapFromEntry(Moon e){
        MoonDTO dto = new MoonDTO();
        dto.setName(e.getName());
        return dto;
    }

    private PlanetDTOResponse mapFromEntry(Planet e){
        PlanetDTOResponse dto = new PlanetDTOResponse();

        List<MoonDTO> moonsDto = new ArrayList<>();
        for(Moon me: e.getMoons()){
            MoonDTO mdto = mapFromEntry(me);
            moonsDto.add(mdto);
        }
        dto.setMoons(moonsDto);

        dto.setName(e.getName());
        dto.setHabblit(e.getHabblit());
        dto.setPlanetType(e.getPlanetType());
        return dto;
    }

    private StarDTOResponse mapFromEntry(Star e){
        StarDTOResponse dto = new StarDTOResponse();

        List<PlanetDTOResponse> planetsDto = new ArrayList<>();
        for(Planet pe: e.getPlanets()){
            PlanetDTOResponse pdto = mapFromEntry(pe);
            planetsDto.add(pdto);
        }
        dto.setPlanets(planetsDto);

        dto.setName(e.getName());

        Float light = e.getLight();
        Float mass = e.getMass();
        Float size = e.getSize();
        Integer temp = e.getTemperatura();

        dto.setLight(light);
        dto.setMass(mass);
        dto.setSize(size);
        dto.setTemperatura(temp);

        dto.setStarClass(StarClass.calcStarClass(mass, size, light, temp));

        return dto;
    }

    private GalaxyDTOResponse mapFromEntry(Galaxy e){
        GalaxyDTOResponse dto = new GalaxyDTOResponse();

        List<StarDTOResponse> starsDto = new ArrayList<>();
        for(Star se: e.getStars()){
            StarDTOResponse sdto = mapFromEntry(se);
            starsDto.add(sdto);
        }
        dto.setStarts(starsDto);

        dto.setName(e.getName());
        dto.setAge(e.getAge());
        dto.setAgeType(e.getAgeType());
        dto.setGalaxyType(e.getGalaxyType());

        return dto;
    }
}
