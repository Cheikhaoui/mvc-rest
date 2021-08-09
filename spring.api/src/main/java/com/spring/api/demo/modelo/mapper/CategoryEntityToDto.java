package com.spring.api.demo.modelo.mapper;

import com.spring.api.demo.modele.Category;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface CategoryEntityToDto {
    Category categoryEntityToDto(com.spring.api.demo.domaino.Category category);

    List<Category> categoryEntityToDto(List<com.spring.api.demo.domaino.Category> category);
}
