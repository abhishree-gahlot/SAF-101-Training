package week3.project.model;

public class InternetPlan 
{
    private int planId;
    private String planName;
    private double price;
    private int speed;
    private int validity;
    private String networkType;

    public InternetPlan(int planId, String planName, double price, int speed, int validity, String networkType) 
    {

        this.planId = planId;
        this.planName = planName;
        this.price = price;
        this.speed = speed;
        this.validity = validity;
        this.networkType = networkType;
    }

    public int getPlanId() 
    {
        return planId;
    }

    public String getPlanName() 
    {
        return planName;
    }

    public double getPrice() 
    {
        return price;
    }

    public int getSpeed() 
    {
        return speed;
    }

    public int getValidity() 
    {
        return validity;
    }

    public String getNetworkType() 
    {
        return networkType;
    }

    @Override
    public String toString() 
    {
        return "Plan ID : " + planId +
                ", Name : " + planName +
                ", Price : " + price +
                ", Speed : " + speed + " Mbps" +
                ", Validity : " + validity + " days" +
                ", Type : " + networkType;
    }
}