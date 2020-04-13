package dataprovider;

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

public class DataProviderExample extends BaseTest{
	
	@DataProvider(name="CustomerAndProduct")
	public Object[][] dataProvider(){
		return buildData();
	}
	
	private static Object[][]  buildData() {
		Product product1 = new Product(100, "LPT", "Laptop", 200);
		Product product2 = new Product(101, "MBL", "Mobile", 300);
		Customer customer1 = new Customer(1000, "TestNG");
		Customer customer2 = new Customer(1001, "Junit");
		Object[][] data = {{customer1, product1},{customer2, product2}};
		return data;
	}
	
	@Epic("TESTS")
	@Feature("DataProviderExample Test")
	@Story("DataProviderExample")
	@TmsLink("Test-1234")
	@Severity(SeverityLevel.MINOR)		
	@Test(groups = {ConstantValues.SMOKE}, dataProvider = "CustomerAndProduct")
	public void testDatProvider(Customer customer, Product product) {
		writeDataToAllureReport(
				"DataProviderExample#testDatProvider",
				"---------------------DataProviderExample----------------------"+
						"Customer id : "+customer.getCustomerId()+
						"Customer name : "+customer.getCustomerName()+
						"Product id : "+product.getProdcutId()+
						"Product code : "+product.getProductCode()+
						"Product name : "+product.getProductName()+
						"Product price : "+product.getProductPrice()+
						"---------------------DataProviderExample----------------------");
	
	}
}
