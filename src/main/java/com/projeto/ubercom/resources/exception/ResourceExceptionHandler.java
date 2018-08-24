package com.projeto.ubercom.resources.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.projeto.ubercom.services.exception.ObjectNotFoundException;

@RestControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e, HttpServletRequest request) {		
		StandardError err = new StandardError(System.currentTimeMillis(),HttpStatus.NOT_FOUND.value(),e.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
		
	}
	
}
