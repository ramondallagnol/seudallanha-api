package com.spring.SeuDallanhaApi.repository;

import com.spring.SeuDallanhaApi.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
