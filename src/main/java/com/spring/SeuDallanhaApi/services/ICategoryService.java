package com.spring.SeuDallanhaApi.services;

import com.spring.SeuDallanhaApi.models.Category;

import java.util.Collection;

public interface ICategoryService {
    Collection<Category> findAll();
    Category findById(long id);
    Category save(Category category);
    void delete(long id);
}
