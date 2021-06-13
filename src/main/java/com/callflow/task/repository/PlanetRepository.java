package com.callflow.task.repository;

import com.callflow.task.model.Planet;
import org.springframework.data.repository.CrudRepository;

public interface PlanetRepository extends CrudRepository<Planet, Long> {
Planet findByName(String name);
}
