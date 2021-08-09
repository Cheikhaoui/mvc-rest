package com.spring.api.demo.modelo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto {

    @ApiModelProperty(required = true, value = "id of category")
    private Long id;
    private String name;
}
