package com.spring.api.demo.modelo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {
    private Long id;
    @ApiModelProperty(required = true, value = "name of customer")
    private String firstName;
    private String lastName;
}
