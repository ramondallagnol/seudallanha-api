package com.spring.SeuDallanhaApi.controller;

import com.spring.SeuDallanhaApi.dtos.ProductDTO;
import com.spring.SeuDallanhaApi.models.Product;
import com.spring.SeuDallanhaApi.services.IProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collection;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    public static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    IProductService IProductService;

    @PostMapping("/save")
    public ResponseEntity<Product> create(@Valid @RequestBody ProductDTO dto) {
        return ResponseEntity.ok(IProductService.save(dto));
    }

    @GetMapping("")
    public ResponseEntity<Collection<Product>> getAll() {
        return ResponseEntity.ok(IProductService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getById(@PathVariable("id") long id) {
        return ResponseEntity.ok(IProductService.findById(id));
    }

//    @DeleteMapping("/{id}")
//    public ResponseEntity<?> delete(@PathVariable("id") long id) {
////        Product product = productService.findById(id);
////        if (product == null) {
////            logger.error("Impossível excluir. Produto com id {} não encontrado.", id);
////            return new ResponseEntity(new CustomErrorType("Não foi possível excluir. Product produto com id " + id + " não encontrado."),
////                    HttpStatus.NOT_FOUND);
////        }
////        return productService.
//    }

}
