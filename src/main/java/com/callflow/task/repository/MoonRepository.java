package com.callflow.task.repository;

import com.callflow.task.model.Moon;
import org.springframework.data.repository.CrudRepository;

public interface MoonRepository extends CrudRepository<Moon, Long> {
    Moon findByName(String name);
}
