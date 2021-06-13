package com.callflow.task.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@Builder
@Data
@ApiModel
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class PlanetDTORequest extends PlanetDTO{
    @Getter
    @Setter
    @ApiModelProperty(dataType = "string", required = true)
    String starName;
    @Override
    public String toString() {
        return super.toString() + ", starName: " + this.starName;
    }
}
