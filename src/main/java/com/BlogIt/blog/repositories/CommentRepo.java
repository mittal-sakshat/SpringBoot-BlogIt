package com.BlogIt.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BlogIt.blog.entities.Comment;

public interface CommentRepo  extends JpaRepository<Comment	, Integer> {

}
