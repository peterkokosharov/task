package com.callflow.task.repository;

import com.callflow.task.model.Star;
import org.springframework.data.repository.CrudRepository;

public interface StarRepository extends CrudRepository<Star, Long> {
    Star findByName(String name);
}
