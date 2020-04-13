package dataprovider;

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

public class DataProviderClassExample extends BaseTest{

	@Epic("TESTS")
	@Feature("DataProviderClassExample Test")
	@Story("DataProviderClassExample")
	@TmsLink("Test-1234")
	@Severity(SeverityLevel.MINOR)	
	@Test(groups = {ConstantValues.SMOKE}, dataProvider = "CustomerAndProduct", dataProviderClass = BuildData.class)
	public void dataProviderClassExample(Customer customer, Product product) {
		writeDataToAllureReport(
				"DataProviderClassExample#dataProviderClassExample",
				"---------------------DataProviderClassExample----------------------"+
						"Customer id : "+customer.getCustomerId()+
						"Customer name : "+customer.getCustomerName()+
						"Product id : "+product.getProdcutId()+
						"Product code : "+product.getProductCode()+
						"Product name : "+product.getProductName()+
						"Product price : "+product.getProductPrice()+
						"---------------------DataProviderClassExample----------------------");
	
	}
}
