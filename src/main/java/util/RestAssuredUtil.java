package util;

import java.io.IOException;

import common.ConstantValues;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import managers.FileReaderManager;

public class RestAssuredUtil {

	public static Response postRequest(Object object, String serviceName) throws IOException {
		RestAssured.baseURI = FileReaderManager.getInstance().getConfigReader().getBaseURL();
		RequestSpecification request = RestAssured.given();
		request.header(ConstantValues.CONTENT_TYPE, ConstantValues.APPLICATION_JSON);
		Response response = request.body(object).post(serviceName);
		return response;
	}
}
