package com.callflow.task.service;

import com.callflow.task.dto.StarDTORequest;

public interface StarService {
    boolean addStar(StarDTORequest starDto) throws Exception;
}
