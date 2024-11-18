package com.BlogIt.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BlogIt.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
