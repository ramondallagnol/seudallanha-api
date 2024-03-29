package com.spring.SeuDallanhaApi.repository;

import com.spring.SeuDallanhaApi.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
