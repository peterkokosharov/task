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
public class MoonDTORequest extends MoonDTO{
    @Getter
    @Setter
    @ApiModelProperty(dataType = "string", required = true)
    String planetName;
    @Override
    public String toString() {
        return super.toString() + ", planetName: " + this.planetName;
    }
}
