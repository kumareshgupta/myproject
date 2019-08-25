
public class Product {
	private Integer productId;
	private String productName;
	private String productDescription;
	private Double productPrice;
	
	public Product(){
		
	}
		
	public Product(Integer productId, String productName, String productDescription, Double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public Double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product Details :- \n Product Id : " + productId + "\n Product Name : " + productName + "\n Product Description : "
				+ productDescription + "\n Product Price : " + productPrice;
	}

	
}
