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
public class PlanetDTOResponse extends PlanetDTO{
    @Getter
    @Setter
    @ApiModelProperty(dataType = "List", required = true)
    List<MoonDTO> moons;
}
