package realtimeprojectType;

public class Products {
	private String PId;
	private String pName;
	private double pPrice;
	private int pQty;
	
	public Products(String pId, String pName, double pPrice, int pQty) {
		super();
		PId = pId;
		this.pName = pName;
		this.pPrice = pPrice;
		this.pQty = pQty;
	}
	public String getPId() {
		return PId;
	}
	public void setPId(String pId) {
		PId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getpPrice() {
		return pPrice;
	}
	public void setpPrice(double pPrice) {
		this.pPrice = pPrice;
	}
	public int getpQty() {
		return pQty;
	}
	public void setpQty(int pQty) {
		this.pQty = pQty;
	}
	@Override
	public String toString() {
		return "Products [PId=" + PId + ", pName=" + pName + ", pPrice=" + pPrice + ", pQty=" + pQty + "]";
	}
	

}
