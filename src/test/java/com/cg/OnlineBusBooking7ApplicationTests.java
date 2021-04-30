package com.cg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.dto.UserDto;
import com.cg.exception.IdNotFoundException;
import com.cg.exception.InvalidBookingUsernameException;
import com.cg.exception.InvalidBusRouteNameException;
import com.cg.exception.InvalidUsernameException;
import com.cg.service.IBookingService;
import com.cg.service.IUsersService;

/**************************************************************
 * 
 * @author Harshitha V
 * Version: 1.0
 * Description: This is the test class for booking module
 * Created date: 25-04-2021
 * 
 ***************************************************************/

@SpringBootTest
class OnlineBusBooking7ApplicationTests {

	@Autowired
	IBookingService bookingService;
	
	
	/***********************************************************************************************************************************
	 * 
	 * @author Harshitha V
	 * Created date: 25-04-2021
	 * This is the test case to check retrieval of an existing institution's details from the database which throws IdNotFoundException
	 * 
	 ***********************************************************************************************************************************/
	
	@Test
	void testBookingIdExists() {
		
		assertThrows(IdNotFoundException.class,()-> {
			bookingService.getBookingDetailsById(100);
		});
	}
	
	/***********************************************************************************************************************************
	 * 
	 * @author Harshitha V
	 * Created date: 25-04-2021
	 * This is the test case to check retrieval of an existing institution's details from the database which throws IdNotFoundException
	 * 
	 ***********************************************************************************************************************************/
	
	@Test
	void testBookingIdExists1() {
		
		assertThrows(IdNotFoundException.class,()-> {
			bookingService.getBookingDetailsById(3);
		});
	}

	

	/**********************************************************************************************************************************************
	 * 
	 * @author Harshitha V
	 * Created date: 25-04-2021
	 * This is the test case to check retrieval of an existing institution's details from the database which throws InvalidBookingUsernameException
	 * 
	 **********************************************************************************************************************************************/
	
	@Test
	void testgetByUsername() {
		
		assertThrows(InvalidBookingUsernameException.class,()-> {
			bookingService.getAllBookingsByUsername("Sonia");
		});
	}
	
	
	/**********************************************************************************************************************************************
	 * 
	 * @author Harshitha V
	 * Created date: 25-04-2021
	 * This is the test case to check retrieval of an existing institution's details from the database which throws InvalidBookingUsernameException
	 * 
	 **********************************************************************************************************************************************/
	
	@Test
	void testgetByUsername2() {
		
		assertThrows(InvalidBookingUsernameException.class,()-> {
			bookingService.getAllBookingsByUsername("hars1");
		});
	}
	
	
	
	/*******************************************************************************************************************************************
	 * 
	 * @author Harshitha V
	 * Created date: 25-04-2021
	 * This is the test case to check retrieval of an existing institution's details from the database which throws InvalidBusRouteNameException
	 * 
	 *******************************************************************************************************************************************/
	
	@Test
	void testforFeedback() {
		
		assertThrows(InvalidBusRouteNameException.class,()-> {
			bookingService.getFeedBackByBusRoute("Delhi");
		});
	}
	
	/*******************************************************************************************************************************************
	 * 
	 * @author Harshitha V
	 * Created date: 25-04-2021
	 * This is the test case to check retrieval of an existing institution's details from the database which throws InvalidBusRouteNameException
	 * 
	 *******************************************************************************************************************************************/
	
	@Test
	void testforFeedback2() {
		
		assertThrows(InvalidBusRouteNameException.class,()-> {
			bookingService.getFeedBackByBusRoute("Bangalore");
		});
	}
	
	
	//Anand
	@Autowired 
    IUsersService userService;
    
	@Test
	void addUserTest() 
	{
		UserDto userdto = new UserDto("harika", "456");
		assertEquals("anand", userService.addUser(userdto).getUsername());
		
		
	}
	@Test
	void updatePasswordTest()
	{
		assertThrows(InvalidUsernameException.class, ()->userService.updatePassword("bindhu","789"));
		
	}


}