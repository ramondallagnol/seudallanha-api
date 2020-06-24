package com.spring.SeuDallanhaApi.services;

import com.spring.SeuDallanhaApi.dtos.ProductDTO;
import com.spring.SeuDallanhaApi.models.Product;
import java.util.Collection;

public interface IProductService {
    Collection<Product> findAll();
    Product findById(long id);
    Product save(ProductDTO productDTO);
    void delete(long id);
}
