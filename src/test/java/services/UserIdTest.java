package services;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import common.ConstantValues;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.qameta.allure.TmsLink;
import io.restassured.response.Response;
import util.RestAssuredUtil;

public class UserIdTest extends BaseTest{

	@Epic("TESTS")
	@Feature("User Id Test")
	@Story("Find user by using user id")
	@TmsLink("Test-2456")
	@Severity(SeverityLevel.BLOCKER)
	@Test(groups = {ConstantValues.SMOKE})
	public void UserIdFoundTest() {
		Response response = RestAssuredUtil.getRequest("user/135");
		String jsonResponse = response.asString();
		System.out.println(jsonResponse);
		Assert.assertEquals(response.getStatusCode(), ConstantValues.HTTP_STATUS_CODE_200, "Statauc code is invalid");
	}
	
	@Epic("TESTS")
	@Feature("User Id Test")
	@Story("Find user by using user id")
	@TmsLink("Test-2456")
	@Severity(SeverityLevel.BLOCKER)
	@Test(groups = {ConstantValues.SMOKE})
	public void UserIdNotFoundTest() {
		Response response = RestAssuredUtil.getRequest("1000");
		String jsonResponse = response.asString();
		System.out.println(jsonResponse);
		Assert.assertEquals(response.getStatusCode(), ConstantValues.HTTP_STATUS_CODE_404, "Statauc code is invalid");
	}	
}
