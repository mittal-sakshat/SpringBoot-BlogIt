package com.BlogIt.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BlogIt.blog.entities.Role;

public interface RoleRepo  extends JpaRepository<Role, Integer>{

}
