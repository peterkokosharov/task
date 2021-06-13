package com.callflow.task.dto;

import io.swagger.annotations.ApiModel;
import lombok.*;

@Builder
@Data
@ApiModel
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class GalaxyDTORequest extends GalaxyDTO{
    @Override
    public String toString() {
        return super.toString();
    }
}
