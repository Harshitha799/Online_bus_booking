package com.cg.entities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Booking {

	private long bookingId; // busoperatorid+busid+date+time+uniqueNumber
	private String username; // login-username
	private List<Pessenger> pessengersInfo;
	private String busNumber;
	private String source;
	private String destination;
	private int numberOfSeats;
	private int amountPaid;
	private LocalDate date;
	private LocalTime journeyStartTime;
	private LocalTime journeyEndTime;
}
