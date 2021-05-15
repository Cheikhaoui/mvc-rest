package com.rest.api.demo.model.mapper;

import com.rest.api.demo.domain.Category;
import com.rest.api.demo.model.CategoryDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface CategoryEntityToDto {
     CategoryDto categoryEntityToDto(Category category);
     List<CategoryDto> categoryEntityToDto(List<Category> category);
}
