package ecommerce;

public class Product {
	
	private int pId;
	private String pName;
	private String pCName;
	private double pPrice;
	private int pQty;
	public Product(int pId, String pName, String pCName, double pPrice,int pQty) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pCName = pCName;
		this.pPrice = pPrice;
		this.pQty=pQty;
		
	}
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pCName=" + pCName + ", pPrice=" + pPrice + ", pQty="
				+ pQty + "]";
	}
	
	
}
