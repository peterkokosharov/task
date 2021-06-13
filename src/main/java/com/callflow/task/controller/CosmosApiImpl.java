package com.callflow.task.controller;

import com.callflow.task.dto.*;
import com.callflow.task.service.GalaxyService;
import com.callflow.task.service.MoonService;
import com.callflow.task.service.PlanetService;
import com.callflow.task.service.StarService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequiredArgsConstructor
public class CosmosApiImpl implements CosmosApi {
    @Autowired
    GalaxyService galaxyService;

    @Override
    public ResponseEntity<String> addGalaxy(GalaxyDTORequest galaxyDto) {
        System.out.println(galaxyDto.toString());

        try {
            boolean op = galaxyService.addGalaxy(galaxyDto);
            if (op) {
                return ResponseEntity.ok("GalaxyAdded");
            } else {
                return ResponseEntity.status(409).body("GalaxyAlreadyCreated");
            }
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Bad Request");
        }
    }

    @Override
    public ResponseEntity<CatalogDTOResponse> catalog() {
        try {
            CatalogDTOResponse resp = galaxyService.getGalaxies();
            return  ResponseEntity.ok(resp);
        }catch(Exception e){
            return ResponseEntity.badRequest().body(null);
        }
    }

    @Autowired
    StarService starService;
    @Override
    public ResponseEntity<String> addStar(StarDTORequest starDto) {
        log.debug(starDto.toString());
        try {
            boolean op = starService.addStar(starDto);
            if (op) {
                return ResponseEntity.ok("StarAdded");
            } else {
                return ResponseEntity.status(409).body("StarAlreadyCreated");
            }
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Bad Request");
        }
    }

    @Autowired
    PlanetService planetService;

    @Override
    public ResponseEntity<String> addPlanet(PlanetDTORequest planetDto) {
        log.debug(planetDto.toString());
        try {
            boolean op = planetService.addPlanet(planetDto);
            if (op) {
                return ResponseEntity.ok("PlanetAdded");
            } else {
                return ResponseEntity.status(409).body("PlanetAlreadyCreated");
            }
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Bad Request");
        }
    }

    @Autowired
    MoonService moonService;

    @Override
    public ResponseEntity<String> addMoon(MoonDTORequest moonDto) {
        log.debug(moonDto.toString());
        try {
            boolean op = moonService.addMoon(moonDto);
            if (op) {
                return ResponseEntity.ok("MoonAdded");
            } else {
                return ResponseEntity.status(409).body("MoonAlreadyCreated");
            }
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Bad Request");
        }
    }


}
