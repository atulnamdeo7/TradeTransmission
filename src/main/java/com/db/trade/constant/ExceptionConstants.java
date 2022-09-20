package com.db.trade.constant;


public enum ExceptionConstants {
	
	ERROR_101("ERROR_101", "Application Error", ApplicationConstant.INTERNAL_SERVER_ERROR),
	ERROR_102("ERROR_102", "Trade version is less than current", ApplicationConstant.PRECONDITION_FAILED),
	ERROR_103("ERROR_103", "Trade maturity date is less than today", ApplicationConstant.PRECONDITION_FAILED),
	ERROR_104("ERROR_104", "Trade Validation Failed", ApplicationConstant.PRECONDITION_FAILED);

	private String errorId;
	private String errorMessage;
	private String httpStatus;

	private ExceptionConstants(String errorId, String errorMessage, String httpStatus) {
		this.errorId = errorId;
		this.errorMessage = errorMessage;
		this.httpStatus = httpStatus;
	}

	public String getErrorId() {
		return errorId;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public String getHttpStatus() {
		return httpStatus;
	}

}
