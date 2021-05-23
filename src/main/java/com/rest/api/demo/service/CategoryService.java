package com.rest.api.demo.service;

import com.rest.api.demo.model.CategoryDto;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryService {
    List<CategoryDto> getAllCategoriers();
    CategoryDto getCAtegoryByName(String name);
}
