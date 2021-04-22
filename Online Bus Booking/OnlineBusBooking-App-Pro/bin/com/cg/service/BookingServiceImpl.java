//package com.cg.service;
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.cg.entities.Booking;
//import com.cg.exceptions.InvalidBookingIdException;
//import com.cg.exceptions.InvalidBusRouteNameException;
//import com.cg.exceptions.InvalidDateException;
////import com.cg.repository.FeedBack;
//import com.cg.repository.IBookingRepository;
////import com.cg.repository.User;
//
//@Service
//public class BookingServiceImpl implements IBookingService
//{
//	@Autowired
//	private IBookingRepository repository;
//	
//	
//	public long addBooking(Booking booking) // return booking id
//	{
//		repository.save(booking);
//		return booking.getBookingId();
//		
//	}
////	public boolean updateBookingDate(long bookingId)throws InvalidDateException{
////		
////		
////	}
////	
////	
////	public boolean deleteBooking(long bookingId) {
////		
////		//repository.deleteById(bookingId);
////		//return repository.existsById(bookingId);
////		
////		if (repository.existsById((int) bookingId)) 
////		{
////			repository.deleteById((int) bookingId);
////		}
////		return repository.existsById((int) bookingId);
////	}
////	
////	
////	public Booking getBookingDetailsById(long bookingId)throws InvalidBookingIdException{
////		
////		Booking bid = repository.findById((int) bookingId).get();
////
////		if (bid == null) {
////			throw new InvalidBookingIdException("id not found in database");
////		}
////
////		Booking bd = new Booking(bookingId);
////		bd.setPassword(b.getPassword());
////		bd.addAuthority(new GrantedAuthorityImpl("ROLE_AUTH"));
////
////		return bd;
////		
////	}
////	
//////	public void addFeedBack(User user,long bookingId)throws InvalidBookingIdException{
//////		
//////		
//////	}
////	
////	public List<Booking> getAllBookingsById(String username){
////		
////		//List<Booking> bookings = repository.findAll(username);
////		//return bookings;
////		
////		List<Booking> bookings = null;
////
////        if (username != null) {
////            bookings = repository.findByUser(repository.findOne(username));
////        }
////        if (bookings == null) {
////            bookings = new ArrayList<Booking>();
////        }
////
////        return bookings;
////	}
////	
////	public List<Booking> getAllBookingByDate(LocalDate date){
////		
////		
////	}
////	public List<Booking> getAllBookingByBusRoute(String routeName)throws InvalidBusRouteNameException{
////		
////		
////	}
////	
////	public void addFeedback(String username,long bookingId,String msg) {
////		
////		
////	}
//////	public List<FeedBack> getFeedBackByBusRoute(String routeName)throws InvalidBusRouteNameException{
//////		
//////		
//////	}
////	
////	
//
//}
