//package com.cg.controller;
//
//import java.time.LocalDate;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.cg.entities.Booking;
//import com.cg.exceptions.IdNotFoundException;
//import com.cg.exceptions.InvalidBookingIdException;
//import com.cg.exceptions.InvalidBusRouteNameException;
//import com.cg.exceptions.InvalidDateException;
//import com.cg.service.BookingServiceImpl;
//
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//
//@RestController
//@Api("Booking API")
//@RequestMapping("/Booking")
//@CrossOrigin("*") 
//public class BookingController 
//{
//	
//	@Autowired
//	private BookingServiceImpl service;
//	
//	@PostMapping("/addBooking")
//	@ApiOperation(value="It will add new booking into the record")
//	public ResponseEntity<Object> addBooking(@RequestBody Booking booking) {
//
//		service.addBooking(booking);
//		return new ResponseEntity<>("Booked successfully", HttpStatus.OK);
//	}
//	
////	@GetMapping("/getAllBookingsById/{username}")
////	public List<Booking> getAllBookingsById(@PathVariable String username){
////		
////		return service.getAllBookingsById(username);
////	}
////
////	@DeleteMapping("/deleteBooking/{bookingId}")
////	public boolean deleteBooking(@PathVariable long bookingId) {
////		return service.deleteBooking(bookingId);
////	}
////	
////	@PostMapping("/updateBookingDate/{bookingId}")
////	public boolean updateBookingDate(@PathVariable long bookingId) throws InvalidDateException {
////		//service.updateBookingDate(bookingId);
////		//return new ResponseEntity<>("Updated records successfully", HttpStatus.OK);
////		//return service.updateBookingDate(bookingId);
////		try {
////			return service.updateBookingDate(bookingId);
////			//return new ResponseEntity<>("Updated records successfully", HttpStatus.OK);
////			} 
////		catch (InvalidDateException e) {
////			throw new InvalidDateException("Invalid date");
////		}
////		
////	}
////	
////	@GetMapping("/getBookingDetailsById/{bookingId}")
////	public Booking getBookingDetailsById(long bookingId)throws InvalidBookingIdException{
////		
////		try {
////			return service.getBookingDetailsById(bookingId);
////		}
////		catch(InvalidBookingIdException e) {
////			throw new InvalidBookingIdException("Invalid book id ");
////		}
////	}
////	
////	
////	
////	
////	@GetMapping("/getAllBookingByDate")
////	public List<Booking> getAllBookingByDate(LocalDate date)
////	{
////		return service.getAllBookingByDate(date);
////			
////	}
////	
////	@GetMapping("/getAllBookingByBusRoute/{routeName}")
////	public List<Booking> getAllBookingByBusRoute(String routeName)throws InvalidBusRouteNameException{
////		
////		try {
////			return service.getAllBookingByBusRoute(routeName);
////		}
////		catch(InvalidBusRouteNameException e) {
////			throw new InvalidBusRouteNameException("Invalid route name ");
////		}
////		
////	}
////	
////	
////	//public void addFeedBack(User user,long bookingId)throws InvalidBookingIdException;
////	//public void addFeedback(String username,long bookingId,String msg);
////	//public List<FeedBack> getFeedBackByBusRoute(String routeName)throws InvalidBusRouteNameException;;
////	
//	
//}
