package base;

import java.io.InputStream;

import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import common.ConstantValues;
import io.qameta.allure.Allure;

public class BaseTest{
	
	@BeforeMethod(groups = { ConstantValues.SMOKE })
	public void beforeMethod() {
		writeDataToAllureReport("BaseTest#beforeMethod","This will execute before every Method");
	}

	@AfterMethod(groups = { ConstantValues.SMOKE })
	public void afterMethod() {
		writeDataToAllureReport("BaseTest#afterMethod","This will execute after every Method");
	}

	@BeforeClass(groups = { ConstantValues.SMOKE })
	public void beforeClass() {
		writeDataToAllureReport("BaseTest#beforeClass","This will execute before the Class");
	}

	@AfterClass(groups = { ConstantValues.SMOKE })
	public void afterClass() {
		writeDataToAllureReport("BaseTest#afterClass","This will execute after the Class");
	}

	@BeforeTest(groups = { ConstantValues.SMOKE })
	public void beforeTest() {
		writeDataToAllureReport("BaseTest#beforeTest","This will execute before the Test");
	}

	@AfterTest(groups = { ConstantValues.SMOKE })
	public void afterTest() {
		writeDataToAllureReport("BaseTest#afterTest","This will execute after the Test");
	}

	@BeforeSuite(groups = { ConstantValues.SMOKE })
	public void beforeSuite(ITestContext context) {
		context.setAttribute("ProductCode", "LPT");
		writeDataToAllureReport("BaseTest#beforeSuite","This will execute before the Test Suite");
	}

	@AfterSuite(groups = { ConstantValues.SMOKE })
	public void afterSuite(ITestContext context) {
		writeDataToAllureReport("BaseTest#afterSuite","This will execute after the Test Suite : "+context.getAttribute("ProductCode"));
	}	

	public void writeDataToAllureReport(String name, String type, String content) {
		Allure.addAttachment(name, type, content);
	}
	
	public void writeDataToAllureReport(String name, String content) {
		Allure.addAttachment(name, content);
	}
	
	public void writeDataToAllureReport(String name, InputStream content) {
		Allure.addAttachment(name, content);
	}

	
}
