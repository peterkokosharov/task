package com.callflow.task.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum GalaxyAgeType {
    @JsonProperty("M") M, // milion years
    @JsonProperty("B") B; // billion years
}
