package services;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import base.BaseTest;
import common.ConstantValues;
import dto.AuthenticationRequest;
import dto.AuthenticationResponse;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.qameta.allure.TmsLink;
import io.restassured.response.Response;
import managers.FileReaderManager;
import util.RestAssuredUtil;

public class AuthenticationServiceTest extends BaseTest{

	private static final ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	
	@Epic("TESTS")
	@Feature("Authentication Service")
	@Story("Authentication")
	@TmsLink("Test-2456")
	@Severity(SeverityLevel.BLOCKER)
	@Test(groups = {ConstantValues.SMOKE})
	public void authenticationServiceTest() throws IOException {
		AuthenticationRequest authentication = FileReaderManager.getInstance().getJsonReader().getAuthenticationData(mapper);
		Response response = RestAssuredUtil.postRequest(mapper, authentication, FileReaderManager.getInstance().getConfigReader().getAuthenticationServiceName());
		String jsonResponse = response.asString();
		Assert.assertEquals(response.getStatusCode(), ConstantValues.HTTP_STATUS_CODE_200, "Statauc code is invalid");
		AuthenticationResponse authenticationResponse = mapper.readValue(jsonResponse, AuthenticationResponse.class);
		Assert.assertEquals(authenticationResponse.getStatus(), "Success", "Authentication response returned inavlid status");
	}
}
