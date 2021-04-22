package com.cg.entityyy;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "booking")
public class Booking
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@SequenceGenerator(name="bookingCounter",sequenceName="bookingSequence",initialValue=1)
	private long bookingId; 
	private String username; 
	
	@ManyToMany(cascade = CascadeType.PERSIST, fetch=FetchType.EAGER)
	@JoinTable(name= "booking_passenger", joinColumns = {@JoinColumn(name="bookingId")}, inverseJoinColumns = {@JoinColumn(name= "passengerId")} )
	private List<Passenger> passengersInfo;
	
	private String busNumber;
	private String source;
	private String destination;
	private int numberOfSeats;
	private int amountPaid;
	private LocalDate datenm;
	private LocalTime journeyStartTime;
	private LocalTime journeyEndTime;

	@ManyToOne
        @JoinColumn(name = "userId")
	private User userInfo;

	public long getbookingId() {
		return bookingId;
	}

	public void setbookingId(long bookingId) {
		this.bookingId = bookingId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Passenger> getpassengersInfo() {
		return passengersInfo;
	}

	public void setpassengersInfo(List<Passenger> passengersInfo) {
		this.passengersInfo = passengersInfo;
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

	public LocalTime getJourneyStartTime() {
		return journeyStartTime;
	}

	public void setJourneyStartTime(LocalTime journeyStartTime) {
		this.journeyStartTime = journeyStartTime;
	}

	public LocalTime getJourneyEndTime() {
		return journeyEndTime;
	}

	public void setJourneyEndTime(LocalTime journeyEndTime) {
		this.journeyEndTime = journeyEndTime;
	}

	public User getuserInfo() {
		return userInfo;
	}

	public void setuserInfo(User userInfo) {
		this.userInfo = userInfo;
	}

	public Booking(long bookingId, String username, List<Passenger> passengersInfo,
			String busNumber, String source, String destination, int numberOfSeats, int amountPaid, LocalDate datenm,
			LocalTime journeyStartTime, LocalTime journeyEndTime, User userInfo) {
		super();
		this.bookingId = bookingId;
		this.username = username;
		this.passengersInfo = passengersInfo;
		this.busNumber = busNumber;
		this.source = source;
		this.destination = destination;
		this.numberOfSeats = numberOfSeats;
		this.amountPaid = amountPaid;
		this.datenm = datenm;
		this.journeyStartTime = journeyStartTime;
		this.journeyEndTime = journeyEndTime;
		this.userInfo = userInfo;
	}

	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", username=" + username + ", passengersInfo="
				+ passengersInfo + ", busNumber=" + busNumber + ", source=" + source + ", destination="
				+ destination + ", numberOfSeats=" + numberOfSeats + ", amountPaid=" + amountPaid + ", datenm=" + datenm
				+ ", journeyStartTime=" + journeyStartTime + ", journeyEndTime=" + journeyEndTime + ", userInfo="
				+ userInfo + "]";
	}

	
	

}
