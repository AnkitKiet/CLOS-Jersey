package com.test.generalinfo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "generalInfo")
public class GeneralInfoPojo {

	String cifNumber;

	public String getCifNumber() {
		return cifNumber;
	}

	public void setCifNumber(String cifNumber) {
		this.cifNumber = cifNumber;
	}

}
