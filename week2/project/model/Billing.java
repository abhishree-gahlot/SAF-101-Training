package week2.project.model;

public class Billing {

    private int billId;
    private int userId;
    private int planId;
    private double amount;
    private String status; 

    public Billing(int billId, int userId, int planId, double amount, String status) {
        this.billId = billId;
        this.userId = userId;
        this.planId = planId;
        this.amount = amount;
        this.status = status;
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPlanId() {
        return planId;
    }

    public void setPlanId(int planId) {
        this.planId = planId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

	@Override
	public String toString() {
		return "Billing [billId=" + billId + ", userId=" + userId + ", planId=" + planId + ", amount=" + amount
				+ ", status=" + status + "]";
	}
    
}