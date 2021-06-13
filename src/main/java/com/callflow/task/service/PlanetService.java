package com.callflow.task.service;

import com.callflow.task.dto.PlanetDTORequest;

public interface PlanetService {
    boolean addPlanet(PlanetDTORequest planetDto) throws Exception;
}
