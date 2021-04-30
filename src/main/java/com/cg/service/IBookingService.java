package com.cg.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.dto.BookingDto;
import com.cg.entity.Booking10;
import com.cg.entity.Feedback10;


/**************************************************************************
 * 
 * @author Harshitha V
 * Version: 1.0
 * Description: This is the service layer's IBookingService interface
 * Created date: 21-04-2021
 * 
 ****************************************************************************/


@Service
public interface IBookingService 
{
	public long addBooking(Booking10 booking); 
	
	public void deleteBooking(long bookingId); 

	boolean updateBookingById(long bookingId, Booking10 booking);

	public Booking10 getBookingDetailsById(long bookingId);

	public Booking10 getAllBookingsByUsername(String username);
	
	public List<Feedback10> getFeedBackByBusRoute(String routeName);

	public Booking10 addBookingdto(BookingDto bookingdto);
	

}