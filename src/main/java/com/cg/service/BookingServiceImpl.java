package com.cg.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dto.BookingDto;
import com.cg.entity.Booking10;
import com.cg.entity.Feedback10;
import com.cg.exception.IdNotFoundException;
import com.cg.exception.InvalidBookingUsernameException;
import com.cg.exception.InvalidBusRouteNameException;
import com.cg.repository.IBookingRepository;
import com.cg.repository.IFeedBackRepository;
import com.cg.repository.IUserRepository;

/******************************************************************
 * 
 * @author Harshitha V
 * Version: 1.0
 * Description: This is the service implementation class of the function declared in the 
 * 				service interface IBookingService that autowires a bean of IBookingService
 * 				to perform JPA Functions
 * Created date: 21-04-2021
 * 
 ******************************************************************/


@Service
public class BookingServiceImpl implements IBookingService
{
	@Autowired
	IBookingRepository bookingRepository;
	
	@Autowired
	IUserRepository userRepository;
	
	@Autowired
	IFeedBackRepository feedbackRepository;
	
	
	/***********************************************************************************
	 * Method: addBooking
	 * @param Booking
	 * @return Long
	 * Description: Adds Booking object passed into the Oracle Database connected to it
	 * 
	 ***********************************************************************************/
	
	@Override
	public long addBooking(Booking10 booking) 
	{
		bookingRepository.save(booking);
		return booking.getBookingId();
	}

	
	/****************************************************************************
	 * Method: deleteBooking
	 * @param bookingId
	 * @return void
	 * @throws IdNotFoundException
	 * Description: deletes Booking object in the Oracle Database connected to it
	 *****************************************************************************/
	
	@Override
	public void deleteBooking(long bookingId) 
	{
		if(bookingRepository.existsById(bookingId))
		{
			bookingRepository.deleteById(bookingId);
		}
		else 
		{
			throw new IdNotFoundException();
		}
	}
	
	
	/**************************************************************************************
	 * Method: updateBookingDate
	 * @param bookingId, booking
	 * @return boolean
	 * @throws IdNotFoundException
	 * Description: Updates booking object passed into the Oracle Database connected to it
	 * 				and updates already existing object. 
	 *************************************************************************************/

	@Override
	public boolean updateBookingById(long bookingId, Booking10 booking) 
	{
		Booking10 updatebooking = bookingRepository.findById(bookingId).get();
		
		
		if(updatebooking == null) 
		{
			throw new IdNotFoundException("Booking Id was not found");
		}
		else
		{
			updatebooking.setDestination(booking.getDestination());
			updatebooking.setBusNumber(booking.getBusNumber());

			bookingRepository.save(updatebooking);
		}
		return true;
	}
	
	
	/**************************************************************************************
	 * Method: getBookingDetailsById
	 * @param bookingId
	 * @return booking
	 * @throws IdNotFoundException
	 * Description: allows client to view booking details of the id passed as the parameter 
	 **************************************************************************************/
	
	@Override
	public Booking10 getBookingDetailsById(long bookingId) 
	{
		if(bookingRepository.existsByBookingId(bookingId)) 
		{
			return bookingRepository.findAllByBookingId(bookingId);
		}
		else {
			 throw new IdNotFoundException();
		}
	}
	
	
	/**************************************************************************************
	 * Method: getAllBookingsByUsername
	 * @param username
	 * @return booking
	 * @throws InvalidBookingUsernameException
	 * Description: allows client to view booking details of the username passed as the parameter 
	 **************************************************************************************/
	
	@Override
	public Booking10 getAllBookingsByUsername(String username){
		
		if(userRepository.existsByUsername(username)) {
			return bookingRepository.findAllByUsername(username);
		}
		else throw new InvalidBookingUsernameException();
		
	}
	
	
	/******************************************************************************************************
	 * Method: getFeedBackByBusRoute
	 * @param routeName
	 * @return booking
	 * @throws InvalidBusRouteNameException
	 * Description: allows client to view feedback of a bus route by passing the routeName as the parameter 
	 ******************************************************************************************************/
	
	@Override
	public List<Feedback10> getFeedBackByBusRoute(String routeName){
		
		if(feedbackRepository.existsByRouteName(routeName)) {
			return bookingRepository.getFeedBackByBusRoute(routeName);
		}
		else {
			throw new InvalidBusRouteNameException();
		}
		
	}


	
	@Transactional
	@Override
	public Booking10 addBookingdto(BookingDto bookingdto)
	{
		Booking10 booking = new Booking10();
		booking.setDatenm(bookingdto.getDate());
		booking.setDestination(bookingdto.getDestination());
		booking.setSource(bookingdto.getSource());
		return bookingRepository.save(booking);
	}
	
	
}