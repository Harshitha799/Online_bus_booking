package com.cg.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.entities.Booking;
import com.cg.entities.User;
import com.cg.exceptions.InvalidBookingIdException;

@Service
public interface IUsersService {

	public void addUser(User user);
	public void deleteUser(String username);
	public void updatePassword(String username,String newPassword);
	
	public User singIn(User user);
	public User singOut(User user);
	
}
