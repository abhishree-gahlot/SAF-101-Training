package week2.project.model;

public class Plan {

    private int planId;
    private String planName;
    private int speedMbps;
    private int dataLimitGB;
    private double price;

    public Plan(int planId, String planName, int speedMbps, int dataLimitGB, double price) {
        this.planId = planId;
        this.planName = planName;
        this.speedMbps = speedMbps;
        this.dataLimitGB = dataLimitGB;
        this.price = price;
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

    public int getSpeedMbps() {
        return speedMbps;
    }

    public void setSpeedMbps(int speedMbps) {
        this.speedMbps = speedMbps;
    }

    public int getDataLimitGB() {
        return dataLimitGB;
    }

    public void setDataLimitGB(int dataLimitGB) {
        this.dataLimitGB = dataLimitGB;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

	@Override
	public String toString() {
		return "Plan [planId=" + planId + ", planName=" + planName + ", speedMbps=" + speedMbps + ", dataLimitGB="
				+ dataLimitGB + ", price=" + price + "]";
	}
    
}