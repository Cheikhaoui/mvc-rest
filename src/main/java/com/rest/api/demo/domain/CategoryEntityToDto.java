package com.rest.api.demo.domain;

import com.rest.api.demo.model.CategoryDto;
import org.mapstruct.Mapper;

@Mapper
public interface CategoryEntityToDto {
    public CategoryDto CategoryEntityToDto(Category category);
}
