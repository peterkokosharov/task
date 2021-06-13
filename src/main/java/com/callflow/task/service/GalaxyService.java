package com.callflow.task.service;

import com.callflow.task.dto.CatalogDTOResponse;
import com.callflow.task.dto.GalaxyDTORequest;

public interface GalaxyService {
    boolean addGalaxy(GalaxyDTORequest galaxyDto) throws Exception;
    CatalogDTOResponse getGalaxies() throws Exception;
}
