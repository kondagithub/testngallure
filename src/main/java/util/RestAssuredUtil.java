package util;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import common.ConstantValues;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import managers.FileReaderManager;

public class RestAssuredUtil {
	
	public static Response postRequest(ObjectMapper mapper, Object requestObject, String serviceName) throws IOException {
		RestAssured.baseURI = FileReaderManager.getInstance().getConfigReader().getBaseURL();
		RequestSpecification request = RestAssured.given();
		request.header(ConstantValues.CONTENT_TYPE, ConstantValues.APPLICATION_JSON);
		Response response = request.body(requestObject).post(serviceName);
		GeneralUtil.writeDataToAllureReport(mapper, ConstantValues.REQUEST, requestObject);
		String jsonResponse = response.asString();
        Object responseObject = mapper.readValue(jsonResponse, Object.class);
        GeneralUtil.writeDataToAllureReport(mapper, ConstantValues.RESPONSE, responseObject);
		return response;
	}
}
