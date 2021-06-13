package com.callflow.task.dto;

import com.callflow.task.model.StarClass;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;


@Data
@ApiModel
@NoArgsConstructor
@AllArgsConstructor
public class StarDTO {
    @Getter
    @Setter
    @ApiModelProperty(dataType = "string", required = true)
    String name;
    @Getter
    @Setter
    @ApiModelProperty(dataType = "float", required = true)
    Float mass;
    @Getter
    @Setter
    @ApiModelProperty(dataType = "float", required = true)
    Float size;
    @Getter
    @Setter
    @ApiModelProperty(dataType = "float", required = true)
    Float light;
    @Getter
    @Setter
    @ApiModelProperty(dataType = "float", required = true)
    Integer temperatura;
}
