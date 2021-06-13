package com.callflow.task.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum PlanetType {
    @JsonProperty("terrestrial") TERESTICAL,
    @JsonProperty("giant planet") GIANT_PLANNET,
    @JsonProperty("ice giant") ICE_GIANT,
    @JsonProperty("mesoplanet") MESOPLANET,
    @JsonProperty("mini-neptune") MINI_NEPTUNE,
    @JsonProperty("planetar") PLANETAR,
    @JsonProperty("super-earth") SUPPER_EARTH,
    @JsonProperty("super-jupiter") SUPPER_JUPITER ,
    @JsonProperty("sub-earth") SUB_EARTH;
}
