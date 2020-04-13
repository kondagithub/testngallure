package dataprovider;

import org.testng.annotations.DataProvider;

import dto.Customer;
import dto.Product;

public class BuildData {

	@DataProvider(name="CustomerAndProduct")
	public static Object[][] dataProvider(){
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
}
