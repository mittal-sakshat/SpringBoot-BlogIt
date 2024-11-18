package com.BlogIt.blog.services;

import com.BlogIt.blog.payloads.CommentDto;

public interface CommentService {

	CommentDto createComment(CommentDto commentDto, Integer postId);

	void deleteComment(Integer commentId);

}
