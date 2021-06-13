package com.callflow.task.service;

import com.callflow.task.dto.MoonDTORequest;

public interface MoonService {
    boolean addMoon(MoonDTORequest moonDto) throws Exception;
}
