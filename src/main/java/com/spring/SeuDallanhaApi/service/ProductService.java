package com.spring.SeuDallanhaApi.service;

import com.spring.SeuDallanhaApi.dtos.ProductDTO;
import com.spring.SeuDallanhaApi.models.Product;
import java.util.Collection;

public interface ProductService {
    Collection<Product> findAll();
    Product findById(long id);
    Product save(ProductDTO productDTO);
    void delete(long id);
}
