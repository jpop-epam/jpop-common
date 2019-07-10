package com.jpop.epam.common.service.exception;

import com.jpop.epam.common.service.constants.ApplicationCommonConstants;

public class NotImplementedException extends RuntimeException implements ApplicationError {

	private static final long serialVersionUID = 5445277604967202095L;
	
	private final String message;
	private final int errorCode;
	
	public NotImplementedException() {
		super();
		this.message = "This functionality has not been implemented yet.";
		this.errorCode = 1000;
	}
	
	public int getErrorCode() {
		return this.errorCode;
	}
	
	@Override
	public String getMessage() {
		return this.message;
	}

	@Override
	public String getErrorTime() {
		return ApplicationCommonConstants.getCurrentDate();
	}

}
