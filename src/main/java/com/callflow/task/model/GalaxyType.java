package com.callflow.task.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public enum GalaxyType {
    @JsonProperty("elliptical") ELLIPTICAL ,
    @JsonProperty("lenticular") LEPTICULAR,
    @JsonProperty("spiral") SPIRAL,
    @JsonProperty("irregular") IRREGULAR
}
