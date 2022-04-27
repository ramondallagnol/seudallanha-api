package com.spring.SeuDallanhaApi.service;

import com.spring.SeuDallanhaApi.models.Category;

import java.util.Collection;

public interface CategoryService {
    Collection<Category> findAll();
    Category findById(long id);
    Category save(Category category);
    void delete(long id);
}
