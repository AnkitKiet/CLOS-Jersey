package com.test;

import org.json.JSONException;
import org.json.JSONObject;

public class DummyData {

	public static String generalInfoDummyData(String cifNumber) {
		JSONObject obJsonObject = new JSONObject();
		try {
			obJsonObject.put("cif_number", cifNumber);
			obJsonObject.put("borrower_name", "Al Haider");
			obJsonObject.put("is_blacklisted", "true");
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return obJsonObject.toString();
	}

}
