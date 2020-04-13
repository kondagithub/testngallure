package context;

import java.util.Arrays;

import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import common.ConstantValues;
import dto.Customer;
import dto.Product;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.qameta.allure.TmsLink;

public class ITestContextExample extends BaseTest{

	@DataProvider(name="CustomerAndProduct")
	public Object[][] dataProvider(ITestContext context){
		String[] groups = context.getIncludedGroups();
		if(Arrays.asList(groups).contains(ConstantValues.SMOKE)) {
			return buildData((String)context.getAttribute("ProductCode"));
		}else {
			return buildData("MBL");
		}
	}
	
	@Epic("TESTS")
	@Feature("ITestContextExample Test")
	@Story("ITestContextExample")
	@TmsLink("Test-1234")
	@Severity(SeverityLevel.MINOR)		
	@Test(groups = {ConstantValues.SMOKE}, dataProvider = "CustomerAndProduct")
	public void test(Customer customer, Product product) {
		writeDataToAllureReport(
				"ITestContextExample#test",
				"---------------------ITestContextExample----------------------"+
						"Customer id : "+customer.getCustomerId()+
						"Customer name : "+customer.getCustomerName()+
						"Product id : "+product.getProdcutId()+
						"Product code : "+product.getProductCode()+
						"Product name : "+product.getProductName()+
						"Product price : "+product.getProductPrice()+
						"---------------------ITestContextExample----------------------");
	}
	
	private static Object[][]  buildData(String productCode) {
		Product product1 = new Product(100, productCode, "Laptop", 200);
		Customer customer1 = new Customer(1000, "TestNG");
		Object[][] data = {{customer1, product1}};
		return data;
	}	
}
