package com.test.generalinfo;

import javax.annotation.security.RolesAllowed;
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

	@Path("/fetchXML")
	@GET
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_XML })
	@Override
	public ResponsePojo fetchDataXML(@QueryParam(value = "cif_number") String cifNumber) {
		ResponsePojo objResponse = new ResponsePojo();
		objResponse.setResponseMsg(DummyData.generalInfoDummyData(cifNumber));
		objResponse.setErrorStatus("false");
		return objResponse;
	}

	@GET
	@Path("/fetchJSON")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_JSON })
	@Override
	public ResponsePojo fetchDataJSON(@QueryParam(value = "cif_number") String cifNumber) {
		ResponsePojo objResponse = new ResponsePojo();
		objResponse.setResponseMsg(DummyData.generalInfoDummyData(cifNumber));
		objResponse.setErrorStatus("false");
		return objResponse;
	}

	@RolesAllowed("ADMIN")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public GeneralInfoPojo getAllEmployees() {
		GeneralInfoPojo list = new GeneralInfoPojo();
		list.setCifNumber("2323232");

		return list;
	}

}
