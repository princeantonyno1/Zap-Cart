package com.digitalstore.imperium.library.service;

import com.digitalstore.imperium.library.dto.CategoryDto;
import com.digitalstore.imperium.library.model.Category;

import java.util.List;

public interface CategoryService {
    /*Admin*/
    List<Category> findAll();
    Category save(Category category);
    Category findById(Long id);
    Category update(Category category);
    void hideById(Long id);
    void enabledById(Long id);
    List<Category> findAllByActivated();
    void deleteById(Long id);

    /*Customer*/
    List<CategoryDto> getCategoryAndProduct();


}
