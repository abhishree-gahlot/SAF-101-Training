package week1.project.service;
import week1.project.model.User;

public class UserService {
	 private final int maxUsers = 10;
	    private int userCount = 0;
	    private User[] userList = new User[maxUsers];

	    public void addUser(User newUser) 
	    {
	        if (userCount < maxUsers) 
	        {
	            userList[userCount] = newUser;
	            userCount++;
	        } 
	        else 
	        {
	            System.out.println("No space in array for users");
	        }
	    }

	    public void displayUsers() 
	    {
	        for (int index = 0; index < userCount; index++) 
	        {
	            System.out.println(userList[index]);
	        }
	    }
}
