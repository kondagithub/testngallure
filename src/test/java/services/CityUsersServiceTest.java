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

public class CityUsersServiceTest extends BaseTest{

	@Epic("TESTS")
	@Feature("Find users in given city")
	@Story("Find Users")
	@TmsLink("Test-2456")
	@Severity(SeverityLevel.BLOCKER)
	@Test(groups = {ConstantValues.SMOKE})
	public void cityServiceTest() {
		Response response = RestAssuredUtil.getRequest("city/London/users");
		String jsonResponse = response.asString();
		System.out.println(jsonResponse);
		Assert.assertEquals(response.getStatusCode(), ConstantValues.HTTP_STATUS_CODE_200, "Statauc code is invalid");
	}
}
