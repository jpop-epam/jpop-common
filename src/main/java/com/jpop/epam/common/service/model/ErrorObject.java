package com.jpop.epam.common.service.model;

import java.io.Serializable;

public class ErrorObject implements Serializable {

	private static final long serialVersionUID = 6596361310526524560L;

	private String message;
	private int errorCode;
	private String errorDate;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDate() {
		return errorDate;
	}

	public void setErrorDate(String errorDate) {
		this.errorDate = errorDate;
	}

}
