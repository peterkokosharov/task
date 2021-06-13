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
public class CatalogDTOResponse {
    @Getter
    @Setter
    @ApiModelProperty(dataType = "List", required = true)
    List<GalaxyDTOResponse> galaxies;
}
