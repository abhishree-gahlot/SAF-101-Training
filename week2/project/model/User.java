package week2.project.model;

public class User {
	private int userId;
	private String name;
	private String email;
	private String phone;
	private boolean activeStatus;
	
	public User(int userId,String name , String email , String phone , boolean activeStatus)
	{
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.activeStatus = activeStatus;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public boolean getActiveStatus() {
		return activeStatus;
	}
	public void setActiveStatus(boolean activeStatus) {
		this.activeStatus = activeStatus;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + ", phone=" + phone + ", activeStatus="
				+ activeStatus + "]";
	}
}
