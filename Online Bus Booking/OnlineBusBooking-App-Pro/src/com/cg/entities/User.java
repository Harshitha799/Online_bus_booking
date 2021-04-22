package com.cg.entities;

import java.util.List;
import java.util.Map;

public class User {

	private String username;
	private String password;
	private Map<Booking, FeedBack> bookingFeedbackInfo;
	private List<Booking> booking;
	
}
