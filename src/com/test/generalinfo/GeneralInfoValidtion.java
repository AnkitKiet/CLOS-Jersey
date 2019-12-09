package com.test.generalinfo;

import com.test.ResponsePojo;

public class GeneralInfoValidtion {

	protected ResponsePojo validateSave(GeneralInfoPojo jsonData) {
		ResponsePojo objResponse = new ResponsePojo();

		try {
			String cifNumber = jsonData.getCifNumber();
			if (cifNumber.length() != 7) {
				objResponse.setErrorMsg("Cif must be of 7 digit");
				objResponse.setErrorStatus("true");
			} else {
				objResponse.setErrorStatus("false");
			}
		} catch (Exception e) {
			e.printStackTrace();
			objResponse.setErrorMsg(e.getMessage());
			objResponse.setErrorStatus("true");
		}

		return objResponse;

	}

}
