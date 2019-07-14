package com.jpop.epam.common.service.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jpop.epam.common.constants.ApplicationCommonConstants;
import com.jpop.epam.common.service.exception.ApplicationError;
import com.jpop.epam.common.service.model.ErrorObject;

@RestControllerAdvice
public class JPOPExceptionAdvice {

	@ExceptionHandler(value = { 
			ApplicationError.class
		})
	public ResponseEntity<Object> handleApplicationException(ApplicationError e) {
		ErrorObject eo = new ErrorObject();
		eo.setErrorCode(e.getErrorCode());
		eo.setMessage(e.getMessage());
		eo.setErrorTime(e.getErrorTime());

		return new ResponseEntity<>(eo, e.getHttpStatus());
	}
	@ExceptionHandler(value = { 
			Exception.class
		})
	public ResponseEntity<Object> handleGenericException(Exception e) {
		ErrorObject eo = new ErrorObject();
		eo.setErrorCode(1010);
		eo.setMessage(e.getMessage());
		eo.setErrorTime(ApplicationCommonConstants.getCurrentDateAsString());

		return new ResponseEntity<>(eo, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
