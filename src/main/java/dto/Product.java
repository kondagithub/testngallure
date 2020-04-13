package dto;


public class Product {

	private Integer prodcutId;
	
	private String productCode;
	
	private String productName;
	
	private Integer productPrice;
	
	public Product(Integer prodcutId, String productCode, String productName, Integer productPrice) {
		this.prodcutId = prodcutId;
		this.productCode = productCode;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public Integer getProdcutId() {
		return prodcutId;
	}

	public void setProdcutId(Integer prodcutId) {
		this.prodcutId = prodcutId;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}
	
	
}
