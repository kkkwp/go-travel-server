package com.travelers.gotravelserver.global.exception;

import lombok.Getter;

public class CustomException extends RuntimeException {

	@Getter
	private final ErrorCode code;

	public CustomException(ErrorCode code) {
		super(code.getMessage());
		this.code = code;
	}

	public CustomException(ErrorCode code, String message) {
		super(message);
		this.code = code;
	}
}
