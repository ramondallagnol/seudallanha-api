package com.spring.SeuDallanhaApi.service.serviceImpl;

import com.spring.SeuDallanhaApi.dtos.ProductDTO;
import com.spring.SeuDallanhaApi.exceptions.ApiRequestException;
import com.spring.SeuDallanhaApi.models.Category;
import com.spring.SeuDallanhaApi.models.Product;
import com.spring.SeuDallanhaApi.repository.CategoryRepository;
import com.spring.SeuDallanhaApi.service.ProductService;
import com.spring.SeuDallanhaApi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public Collection<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(long id) {
        return productRepository.findById(id).orElseThrow(() -> new ApiRequestException("Produto com id "+id+" Não encontrado" ));
    }

    @Override
    public Product save(ProductDTO dto) {
        Optional<Category> category = categoryRepository.findById(dto.getCategoryId());

        Product product = dto.convertToObject();

        product.setCategory(category.orElseThrow(() -> new ApiRequestException("Categoria "+dto.getCategoryId()+" informada não existe")));

        return productRepository.save(product);
    }

    @Override
    public void delete(long id){
        productRepository.deleteById(id);
    }
}
