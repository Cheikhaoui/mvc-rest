package com.spring.api.demo.controller;

import com.spring.api.demo.modele.Category;
import com.spring.api.demo.service.CategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Api(value = "this is Category WebService yeaaah")
@RestController
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @ApiOperation(value = "View List of categories")
    @GetMapping(value = "/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Category> getAllCategories() {
        return categoryService.getAllCategoriers();
    }
    

    @GetMapping(value = "/{name}")
    @ResponseStatus(HttpStatus.OK)
    public Category getCategoryByName(@PathVariable String name) {
        Category category = categoryService.getCAtegoryByName(name);
        if (category == null) {
          //  throw new RessourceNotFoundException("I can't found a category with the name" +
            //        name);
            return null;
        } else {
            return categoryService.getCAtegoryByName(name);
        }
    }
}
