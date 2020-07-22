package com.canalogies.shop.model;

public class ErrorMessage {

	int errId;
	String errorMessage;
	String document;
	public int getErrId() {
		return errId;
	}
	public void setErrId(int errId) {
		this.errId = errId;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getDocument() {
		return document;
	}
	public void setDocument(String document) {
		this.document = document;
	}
	public ErrorMessage(int errId, String errorMessage, String document) {
		super();
		this.errId = errId;
		this.errorMessage = errorMessage;
		this.document = document;
	}
	public ErrorMessage() { 
	}
	
}
