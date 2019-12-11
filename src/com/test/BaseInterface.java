package com.test;

import com.test.generalinfo.GeneralInfoPojo;

public interface BaseInterface {

	ResponsePojo saveData(GeneralInfoPojo jsonObject);

	ResponsePojo fetchDataJSON(String cifNumber);

	ResponsePojo fetchDataXML(String cifNumber);
}
