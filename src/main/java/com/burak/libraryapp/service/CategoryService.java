package com.burak.libraryapp.service;

import com.burak.libraryapp.exception.CategoryNotFoundById;
import com.burak.libraryapp.model.Category;
import com.burak.libraryapp.repository.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;
    public CategoryService(CategoryRepository categoryRepository){ //constructor inj{
        this.categoryRepository = categoryRepository;
    }

    public Category getCategoryById(Long categoryId) {
        return categoryRepository.findById(categoryId)
                .orElseThrow(()-> new CategoryNotFoundById("category not found by id"));
    }
}
