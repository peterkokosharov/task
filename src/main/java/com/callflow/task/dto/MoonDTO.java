package com.callflow.task.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@Data
@ApiModel
@NoArgsConstructor
@AllArgsConstructor
public class MoonDTO {
    @Getter
    @Setter
    @ApiModelProperty(dataType = "string", required = true)
    String name;
}
