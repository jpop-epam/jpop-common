package com.jpop.epam.common.service.exception;

public interface ApplicationError {
	String getMessage();
	int getErrorCode();
	String getErrorTime();
}
