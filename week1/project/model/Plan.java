package week1.project.model;

public class Plan {
	private int planId;
	private String planName;
	private int price;
	private int validity;
	
	public Plan(int planId, String planName, int price, int validity)
	{
		this.planId = planId;
		this.planName = planName;
		this.price = price;
		this.validity = validity;
	}
	
	public int getPlanId() {
		return planId;
	}
	
	public void setPlanId(int planId) {
		this.planId = planId;
	}
	
	public String getPlanName() {
		return planName;
	}
	
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getValidity() {
		return validity;
	}
	
	public void setValidity(int validity) {
		this.validity = validity;
	}

	@Override
	public String toString() {
		return "Plan [planId=" + planId + ", planName=" + planName + ", price=" + price + ", validity=" + validity
				+ "]";
	}
}
