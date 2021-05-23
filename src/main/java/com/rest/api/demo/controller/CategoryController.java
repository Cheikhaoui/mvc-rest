package com.rest.api.demo.controller;

import com.rest.api.demo.model.CategoryDto;
import com.rest.api.demo.service.CategoryService;
import com.rest.api.demo.service.RessourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryService categoryService ;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping(value = "/all")
    @ResponseStatus(HttpStatus.OK)
    public List<CategoryDto> getAllCategories(){
        return categoryService.getAllCategoriers();
    }

    @GetMapping(value = "/{name}")
    @ResponseStatus(HttpStatus.OK)
    public CategoryDto getCategoryByName(@PathVariable String name){
        CategoryDto category = categoryService.getCAtegoryByName(name);
        if(category == null){
            throw new RessourceNotFoundException("I can't found a category with the name" +
                    name);
        }
        else {
        return categoryService.getCAtegoryByName(name);
        }
    }
}
