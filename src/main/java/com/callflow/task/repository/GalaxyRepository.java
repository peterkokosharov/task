package com.callflow.task.repository;

import com.callflow.task.model.Galaxy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GalaxyRepository extends CrudRepository<Galaxy, Long> {
    Galaxy findByName(String name);
}
