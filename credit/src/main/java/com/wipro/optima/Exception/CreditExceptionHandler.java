package com.wipro.optima.Exception;




import org.springframework.http.HttpStatus;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;




@ControllerAdvice
public class CreditExceptionHandler extends ResponseEntityExceptionHandler{
	
	
	@ExceptionHandler(NotFoundException.class)
	public  ResponseEntity<Object> handleCreditException(NotFoundException ex,WebRequest request)
	{
		Error e=new Error("1001",ex.getMessage());
		return new ResponseEntity<Object>(e,HttpStatus.NOT_FOUND);
		
	}
	
    @ExceptionHandler(LengthExceedsException .class)
	public  ResponseEntity<Object> handleLengthExceedsException(LengthExceedsException ex,WebRequest request)
	{
		Error e=new Error("1002",ex.getMessage());
		return new ResponseEntity<Object>(e,HttpStatus.BAD_REQUEST);
		
	}
	
    @Override
    public ResponseEntity<Object> handleNoHandlerFoundException(NoHandlerFoundException exception,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		
		Error e=new Error("1003","Api Not Found");
		return new ResponseEntity<Object>(e, HttpStatus.NOT_IMPLEMENTED);
	}
	
	
	

}
