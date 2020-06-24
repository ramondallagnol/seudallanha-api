package com.spring.SeuDallanhaApi.controller;

import com.spring.SeuDallanhaApi.dtos.CategoryDTO;
import com.spring.SeuDallanhaApi.models.Category;
import com.spring.SeuDallanhaApi.services.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@CrossOrigin(origins = "*")
@RequestMapping("api/category")
@RestController
public class CategoryController {

    @Autowired
    ICategoryService ICategoryService;

    @PostMapping("/save")
    public ResponseEntity<Category> create(@RequestBody CategoryDTO dto) {
        return ResponseEntity.ok(ICategoryService.save(dto.convertToObject()));
    }

    @GetMapping("")
    public ResponseEntity<Collection<Category>> getAll() {
        return ResponseEntity.ok(ICategoryService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> getById(@PathVariable("id") long id) {
        return ResponseEntity.ok(ICategoryService.findById(id));
    }

}
