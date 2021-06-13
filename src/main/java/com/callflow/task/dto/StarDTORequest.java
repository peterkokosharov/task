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
public class StarDTORequest extends StarDTO{

    @Getter
    @Setter
    @ApiModelProperty(dataType = "string", required = true)
    String galaxyName;

    @Override
    public String toString() {
        return super.toString() + ", galaxyName: " + this.galaxyName;
    }
}
