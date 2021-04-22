package com.cg.repository;

import java.util.List;

import com.cg.entities.Booking;
import com.cg.entities.User;
import com.cg.exceptions.InvalidBookingIdException;

public interface IUsersRepository {

	public void addUser(User user);
	public void deleteUser(String username);
	public void updatePassword(String username,String newPassword);
	
	
	public User singIn(User user);
	public User singOut(User user);
	
}
