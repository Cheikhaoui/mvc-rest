package com.rest.api.demo.controller;

import com.rest.api.demo.model.CategoryDto;
import com.rest.api.demo.service.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryService categoryService ;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping(value = "/all")
    public ResponseEntity<List<CategoryDto>> getAllCategories(){
        return new ResponseEntity<>(
                categoryService.getAllCategoriers(), HttpStatus.OK);
    }

    @GetMapping(value = "/{name}")
    public ResponseEntity<CategoryDto> getCategoryByName(@PathVariable String name){
        return new ResponseEntity<>(
                categoryService.getCAtegoryByName(name), HttpStatus.OK);
    }
}
