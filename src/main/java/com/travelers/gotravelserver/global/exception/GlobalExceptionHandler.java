package com.travelers.gotravelserver.global.exception;

import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(CustomException.class)
	public ResponseEntity<ErrorResponse> handleCustomException(CustomException ex) {
		ErrorCode code = ex.getCode();
		ErrorResponse response = ErrorResponse.builder()
			.status(code.getStatus())
			.error(code.name())
			.message(code.getMessage())
			.timestamp(LocalDateTime.now())
			.build();
		return ResponseEntity.status(code.getStatus()).body(response);
	}

	// 예상치 못한 예외
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> handleGeneralException(Exception ex) {
		ErrorResponse response = ErrorResponse.builder()
			.status(500)
			.error("INTERNAL_ERROR")
			.message(ex.getMessage())
			.timestamp(LocalDateTime.now())
			.build();
		return ResponseEntity.internalServerError().body(response);
	}
}
