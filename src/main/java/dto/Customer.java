package dto;

public class Customer {

	private Integer customerId;
	
	private String customerName;

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String cutsomerName) {
		this.customerName = cutsomerName;
	}

	public Customer(Integer customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
	}
}
