package com.spring.SeuDallanhaApi.repository;

import com.spring.SeuDallanhaApi.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
