package groups;

import org.testng.annotations.Test;

import base.BaseTest;
import common.ConstantValues;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.qameta.allure.TmsLink;

public class GroupingExample extends BaseTest{

	@Epic("TESTS")
	@Feature("GroupingExample Test")
	@Story("SMOKE")
	@TmsLink("Test-1234")
	@Severity(SeverityLevel.MINOR)
	@Test(groups = { ConstantValues.SMOKE })
	public void smokeTest() {
		writeDataToAllureReport("GroupingExample#smokeTest","in SMOKE group");
	}

	@Epic("TESTS")
	@Feature("GroupingExample Test")
	@Story("FUNCTIONAL")
	@TmsLink("Test-1234")
	@Severity(SeverityLevel.MINOR)
	@Test(groups = { ConstantValues.FUNCTIONAL })
	public void functionalTest() {
		writeDataToAllureReport("GroupingExample#functionalTest","in FUNCTIONAL group");
	}

	@Epic("TESTS")
	@Feature("GroupingExample Test")
	@Story("REGRESSION")
	@TmsLink("Test-1234")
	@Severity(SeverityLevel.MINOR)
	@Test(groups = { ConstantValues.REGRESSION })
	public void regressionTest() {
		writeDataToAllureReport("GroupingExample#regressionTest","in REGRESSION group");
	}
}
