package com.spring.api.demo.model.mapper;

import com.spring.api.demo.domain.Category;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface CategoryEntityToDto {
    rest.model.Category categoryEntityToDto(Category category);

    List<rest.model.Category> categoryEntityToDto(List<Category> category);
}
