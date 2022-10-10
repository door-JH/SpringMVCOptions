package info.example.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends RuntimeException{
	
	@ExceptionHandler(java.lang.NullPointerException.class)
	public String handleException() {
		return "error1";
	}
	
}
