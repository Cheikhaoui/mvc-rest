package com.rest.api.demo.repository;

import com.rest.api.demo.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
    Category getByName(String name);


}
