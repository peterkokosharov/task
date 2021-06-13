package com.callflow.task.dto;

import com.callflow.task.model.StarClass;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.util.List;

@Builder
@Data
@ApiModel
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class StarDTOResponse extends StarDTO {

    StarClass starClass;
    @ApiModelProperty(dataType = "string", required = false)
    public StarClass getStarClass(){
        return StarClass.calcStarClass(mass, size, light, temperatura);
    }

    @Getter
    @Setter
    @ApiModelProperty(dataType = "List", required = true)
    List<PlanetDTOResponse> planets;
}
