package com.spring.api.demo.service;


import com.spring.api.demo.modele.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategoriers();

    Category getCAtegoryByName(String name);
}
