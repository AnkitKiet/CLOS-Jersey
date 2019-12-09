package com.test.generalinfo;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.test.BaseInterface;
import com.test.DummyData;
import com.test.ResponsePojo;

@Path("/GeneralInfo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeneralInfo extends GeneralInfoValidtion implements BaseInterface {

	@Path("/save")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Override
	public ResponsePojo saveData(GeneralInfoPojo jsonObject) {
		ResponsePojo objResponse = validateSave(jsonObject);
		if ("false".equalsIgnoreCase(objResponse.getErrorStatus()))
			objResponse.setResponseMsg("saved successfully");
		return objResponse;
	}

	@Path("/fetch")
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Override
	public ResponsePojo fetchData(@QueryParam(value = "cif_number") String cifNumber) {
		ResponsePojo objResponse = new ResponsePojo();
		objResponse.setResponseMsg(DummyData.generalInfoDummyData(cifNumber));
		objResponse.setErrorStatus("false"); 
		return objResponse;
	}

}
