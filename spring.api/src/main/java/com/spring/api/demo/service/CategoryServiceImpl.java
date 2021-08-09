package com.spring.api.demo.service;

import com.spring.api.demo.modelo.mapper.CategoryEntityToDto;
import com.spring.api.demo.modele.Category;
import com.spring.api.demo.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    private final CategoryEntityToDto categoryEntityToDto;

    public CategoryServiceImpl(CategoryRepository categoryRepository, CategoryEntityToDto categoryEntityToDto) {
        this.categoryRepository = categoryRepository;
        this.categoryEntityToDto = categoryEntityToDto;
    }

    @Override
    public List<Category> getAllCategoriers() {
        return categoryEntityToDto.categoryEntityToDto(categoryRepository.findAll());
    }

    @Override
    public Category getCAtegoryByName(String name) {
        return categoryEntityToDto.categoryEntityToDto(categoryRepository.getByName(name));
    }
}
