package com.furnitureapp.exceptions;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.furnitureapp.model.ApiErrors;


@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{

	@Override
	protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		String message=ex.getMessage();
		List<Object> error=Arrays.asList("the method is not supported",
				ex.getSupportedHttpMethods() +"not supported",ex.getSupportedHttpMethods());
		//HttpHeaders httpHeaders=new HttpHeaders();
		headers.add("info", "invalid method");
		ApiErrors errors=new ApiErrors(LocalDateTime.now(),message,status,status.value(),error);
		return ResponseEntity.status(status).headers(headers).body(errors);
	}

	@Override
	protected ResponseEntity<Object> handleHttpMediaTypeNotSupported(HttpMediaTypeNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		
		String message=ex.getMessage();
		List<Object> error=Arrays.asList("the media type is not supported",
			ex.getContentType()+"media not found",	ex.getSupportedMediaTypes());
		//HttpHeaders httpHeaders=new HttpHeaders();
		headers.add("info", "media type is not supported");
		ApiErrors errors=new ApiErrors(LocalDateTime.now(),message,status,status.value(),error);
		return ResponseEntity.status(status).headers(headers).body(errors);
		
	}

	@Override
	protected ResponseEntity<Object> handleMissingPathVariable(MissingPathVariableException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		
		String message=ex.getMessage();
		List<Object> error=Arrays.asList("the missing the pathvariable",
				 ex.getParameter()+"is missing",ex.getVariableName()+"is expected");
		//HttpHeaders httpHeaders=new HttpHeaders();
		headers.add("info", "missing path variable");
		ApiErrors errors=new ApiErrors(LocalDateTime.now(),message,status,status.value(),error);
		return ResponseEntity.status(status).headers(headers).body(errors);
	}

	
	//http://localhost:8080/book-api/books/bookId/tech

	@Override
	protected ResponseEntity<Object> handleTypeMismatch(TypeMismatchException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		String message=ex.getMessage();
		List<Object> error=Arrays.asList(" type mismatch",
				ex.getRequiredType()+"is missing");
		
		headers.add("info", "invalid type");
		ApiErrors errors=new ApiErrors(LocalDateTime.now(),message,status,status.value(),error);
		return ResponseEntity.status(status).headers(headers).body(errors);
	}
	
	
//	  @ExceptionHandler(FurnitureNotFoundException.class) public ResponseEntity<Object>
//	  handleFurnitureNotFound(FurnitureNotFoundException ex){
//	 
//	  
//	  String message=ex.getMessage(); List<Object>
//	  error=Arrays.asList(" book not avilable"); HttpHeaders httpHeaders=new
//	  HttpHeaders();
//	  
//	  httpHeaders.add("info", "book not found"); ApiErrors errors=new
//	  ApiErrors(LocalDateTime.now(),message,HttpStatus.INTERNAL_SERVER_ERROR,
//	  HttpStatus.INTERNAL_SERVER_ERROR.value(),error); return
//	  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).headers(httpHeaders).
//	  body(errors);
//	  
//	  
//	 
//	 }
//	 
//	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> handleBookNotFound(Exception ex){
		
		
		String message=ex.getMessage();
		List<Object> error=Arrays.asList(" other");
		HttpHeaders httpHeaders=new HttpHeaders();	
		
		httpHeaders.add("info", "other");
		ApiErrors errors=new ApiErrors(LocalDateTime.now(),message,HttpStatus.INTERNAL_SERVER_ERROR,HttpStatus.INTERNAL_SERVER_ERROR.value(),error);
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).headers(httpHeaders).body(errors);
		
}
}