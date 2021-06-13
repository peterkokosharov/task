package com.callflow.task.dto;

import com.callflow.task.model.GalaxyAgeType;
import com.callflow.task.model.GalaxyType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;


@Data
@ApiModel
@NoArgsConstructor
@AllArgsConstructor
public class GalaxyDTO {
    @Getter
    @Setter
    @ApiModelProperty(dataType = "string", required = true)
    String name;

    @Getter
    @Setter
    @ApiModelProperty(dataType = "string", allowableValues = "elliptical, lenticular, spiral, irregular", required = true)
    GalaxyType galaxyType;

    @Getter
    @Setter
    @ApiModelProperty(dataType = "float", required = true)
    Float age;

    @Getter
    @Setter
    @ApiModelProperty(dataType = "string", allowableValues = "M, B", required = true)
    GalaxyAgeType ageType;

}
