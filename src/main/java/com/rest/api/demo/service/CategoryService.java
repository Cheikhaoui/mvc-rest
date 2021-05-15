package com.rest.api.demo.service;

import com.rest.api.demo.model.CategoryDto;

import java.util.List;

public interface CategoryService {
    List<CategoryDto> getAllCategoriers();
    CategoryDto getCAtegoryByName(String name);
}
