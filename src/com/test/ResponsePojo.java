package com.test;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "response")
public class ResponsePojo {

	private String errorMsg;
	private String errorStatus;
	private Object responseMsg;

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getErrorStatus() {
		return errorStatus;
	}

	public void setErrorStatus(String errorStatus) {
		this.errorStatus = errorStatus;
	}

	public Object getResponseMsg() {
		return responseMsg;
	}

	public void setResponseMsg(Object responseMsg) {
		this.responseMsg = responseMsg;
	}

}
