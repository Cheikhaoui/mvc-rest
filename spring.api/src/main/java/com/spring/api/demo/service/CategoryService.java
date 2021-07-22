package com.spring.api.demo.service;


import rest.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategoriers();

    Category getCAtegoryByName(String name);
}
