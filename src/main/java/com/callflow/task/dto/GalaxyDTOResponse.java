package com.callflow.task.dto;

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
public class GalaxyDTOResponse extends GalaxyDTO{
    @Getter
    @Setter
    @ApiModelProperty(dataType = "List", required = true)
    List<StarDTOResponse> starts;
}
