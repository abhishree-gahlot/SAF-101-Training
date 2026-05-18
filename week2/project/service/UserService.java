package week2.project.service;

import week2.project.model.User;
import week2.project.exception.UserNotFoundException;

public class UserService {
	int maxUsers = 10;
    private User[] users = new User[maxUsers];
    private int count = 0;

    public void addUser(User user) 
    {
        users[count++] = user;
        System.out.println("User added successfully");
    }

    public User getUserById(int userId) throws UserNotFoundException 
    {
        for (int index = 0; index < count; index++) 
        {
            if (users[index].getUserId() == userId) 
            {
                return users[index];
            }
        }
        throw new UserNotFoundException("User with ID " + userId + " not found");
    }
}