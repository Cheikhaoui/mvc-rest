package com.rest.api.demo.service;

import com.rest.api.demo.model.mapper.CategoryEntityToDto;
import com.rest.api.demo.model.CategoryDto;
import com.rest.api.demo.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    private final CategoryEntityToDto categoryEntityToDto;

    public CategoryServiceImpl(CategoryRepository categoryRepository , CategoryEntityToDto categoryEntityToDto) {
        this.categoryRepository = categoryRepository;
        this.categoryEntityToDto= categoryEntityToDto;
    }

    @Override
    public List<CategoryDto> getAllCategoriers() {
        return categoryEntityToDto.categoryEntityToDto(categoryRepository.findAll());
    }

    @Override
    public CategoryDto getCAtegoryByName(String name) {
        return categoryEntityToDto.categoryEntityToDto(categoryRepository.getByName(name));
    }
}
