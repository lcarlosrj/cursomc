package com.luiz.cursomc.resources.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.luiz.cursomc.services.execptions.ObjectNotFoundExeption;

@ControllerAdvice
public class ResourceExecptionHandler {

	@ExceptionHandler(ObjectNotFoundExeption.class)
	public ResponseEntity<StandartError> objectNotFound(ObjectNotFoundExeption e, HttpServletRequest request){
		
		StandartError err = new StandartError(HttpStatus.NOT_FOUND.value(), e.getMessage(), System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
	}
}
