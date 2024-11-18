package com.BlogIt.blog.exceptions;

public class ApiException extends RuntimeException {

	public ApiException(String message) {
		super(message);

	}

	public ApiException() {
		super();

	}

}
