package com.cg.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;


public class BookingDto {
	@NotEmpty(message = "username should not be empty")
	@Length(min = 3, max = 15)
	private String username;
	private String busNumber;
	private String source;
	private String destination;
	private int numberOfSeats;
	private int amountPaid;
	public LocalDate datenm;


	public BookingDto() {
		super();
	}

	

	public BookingDto(@NotEmpty(message = "username should not be empty") @Length(min = 3, max = 15) String username,
			String busNumber, String source, String destination, int numberOfSeats, int amountPaid, LocalDate datenm) {
		super();
		this.username = username;
		this.busNumber = busNumber;
		this.source = source;
		this.destination = destination;
		this.numberOfSeats = numberOfSeats;
		this.amountPaid = amountPaid;
		this.datenm = datenm;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getBusNumber() {
		return busNumber;
	}



	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}



	public String getSource() {
		return source;
	}



	public void setSource(String source) {
		this.source = source;
	}



	public String getDestination() {
		return destination;
	}



	public void setDestination(String destination) {
		this.destination = destination;
	}



	public int getNumberOfSeats() {
		return numberOfSeats;
	}



	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}



	public int getAmountPaid() {
		return amountPaid;
	}



	public void setAmountPaid(int amountPaid) {
		this.amountPaid = amountPaid;
	}



	public LocalDate getDatenm() {
		return datenm;
	}



	public void setDatenm(LocalDate datenm) {
		this.datenm = datenm;
	}



	

	
	
}
