package com.callflow.task.dto;

import com.callflow.task.model.PlanetType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@Data
@ApiModel
@NoArgsConstructor
@AllArgsConstructor
public class PlanetDTO {
    @Getter
    @Setter
    @ApiModelProperty(dataType = "string", required = true)
    String name;
    @Getter
    @Setter
    @ApiModelProperty(dataType = "boolean", required = true)
    Boolean habblit;
    @Getter
    @Setter
    @ApiModelProperty(dataType = "string",
            allowableValues = "terrestrial, giant planet, ice giant, mesoplanet, mini-neptune, planetar, super-earth, super-jupiter, sub-earth.", required = true)
    PlanetType planetType;
}
