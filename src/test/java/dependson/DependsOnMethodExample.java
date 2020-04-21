package dependson;

import org.testng.annotations.Test;

import base.BaseTest;
import common.ConstantValues;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.qameta.allure.TmsLink;

public class DependsOnMethodExample extends BaseTest{

	@Epic("TESTS")
	@Feature("DependsOnMethodExample Test")
	@Story("DependsOnMethodExample")
	@TmsLink("Test-1234")
	@Severity(SeverityLevel.MINOR)
	@Test(groups = { ConstantValues.SMOKE }, dependsOnMethods = { "secondMethod" })
	public void firstMethod() {
		writeDataToAllureReport("DependsOnMethodExample#firstMethod","firstMethod will execute first");
	}

	@Epic("TESTS")
	@Feature("DependsOnMethodExample Test")
	@Story("DependsOnMethodExample")
	@TmsLink("Test-1234")
	@Severity(SeverityLevel.MINOR)
	@Test(groups = { ConstantValues.SMOKE }, dependsOnMethods = { "thirdMethod" })
	public void secondMethod() {
		writeDataToAllureReport("DependsOnMethodExample#secondMethod","secondMethod will execute second");
	}

	@Epic("TESTS")
	@Feature("DependsOnMethodExample Test")
	@Story("DependsOnMethodExample")
	@TmsLink("Test-1234")
	@Severity(SeverityLevel.MINOR)
	@Test(groups = { ConstantValues.SMOKE })
	public void thirdMethod() {
		writeDataToAllureReport("DependsOnMethodExample#thirdMethod","thirdMethod will execute third");
	}
}
