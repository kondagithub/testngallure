package priority;

import org.testng.annotations.Test;

import base.BaseTest;
import common.ConstantValues;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.qameta.allure.TmsLink;

public class PriorityExample extends BaseTest{

	@Epic("TESTS")
	@Feature("PriorityExample Test")
	@Story("PriorityExample")
	@TmsLink("Test-1234")
	@Severity(SeverityLevel.MINOR)
	@Test(priority = 0, groups = { ConstantValues.SMOKE })
	public void one() {
		writeDataToAllureReport("PriorityExample#one","This is the Test Case number One");
	}

	@Epic("TESTS")
	@Feature("PriorityExample Test")
	@Story("PriorityExample")
	@TmsLink("Test-1235")
	@Severity(SeverityLevel.MINOR)
	@Test(priority = 1, groups = { ConstantValues.SMOKE })
	public void two() {
		writeDataToAllureReport("PriorityExample#two","This is the Test Case number two");
	}

	@Epic("TESTS")
	@Feature("PriorityExample Test")
	@Story("PriorityExample")
	@TmsLink("Test-1236")
	@Severity(SeverityLevel.MINOR)
	@Test(priority = 2, groups = { ConstantValues.SMOKE })
	public void three() {
		writeDataToAllureReport("PriorityExample#three","This is the Test Case number three");
	}

	@Epic("TESTS")
	@Feature("PriorityExample Test")
	@Story("PriorityExample")
	@TmsLink("Test-1237")
	@Severity(SeverityLevel.MINOR)
	@Test(priority = 3, groups = { ConstantValues.SMOKE })
	public void four() {
		writeDataToAllureReport("PriorityExample#four","This is the Test Case number four");
	}
}
