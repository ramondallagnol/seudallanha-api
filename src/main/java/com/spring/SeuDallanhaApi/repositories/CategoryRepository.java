package com.spring.SeuDallanhaApi.repositories;

import com.spring.SeuDallanhaApi.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
