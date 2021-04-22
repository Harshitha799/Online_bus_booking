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
@Table(name = "full_booking")
public class full_booking
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@SequenceGenerator(name="full_bookingCounter",sequenceName="full_bookingSequence",initialValue=1)
	private long full_bookingId; 
	private String username; 
	
	@ManyToMany(cascade = CascadeType.PERSIST, fetch=FetchType.EAGER)
	@JoinTable(name= "full_booking_full_passenger", joinColumns = {@JoinColumn(name="full_bookingId")}, inverseJoinColumns = {@JoinColumn(name= "full_passengerId")} )
	private List<full_passenger> full_passengersInfo;
	
	private String busNumber;
	private String source;
	private String destination;
	private int numberOfSeats;
	private int amountPaid;
	private LocalDate datenm;
	private LocalTime journeyStartTime;
	private LocalTime journeyEndTime;

	@ManyToOne
    @JoinColumn(name = "full_userId")
	private full_user full_userInfo;

	public long getFull_bookingId() {
		return full_bookingId;
	}

	public void setFull_bookingId(long full_bookingId) {
		this.full_bookingId = full_bookingId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<full_passenger> getFull_passengersInfo() {
		return full_passengersInfo;
	}

	public void setFull_passengersInfo(List<full_passenger> full_passengersInfo) {
		this.full_passengersInfo = full_passengersInfo;
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

	public full_user getFull_userInfo() {
		return full_userInfo;
	}

	public void setFull_userInfo(full_user full_userInfo) {
		this.full_userInfo = full_userInfo;
	}

	public full_booking(long full_bookingId, String username, List<full_passenger> full_passengersInfo,
			String busNumber, String source, String destination, int numberOfSeats, int amountPaid, LocalDate datenm,
			LocalTime journeyStartTime, LocalTime journeyEndTime, full_user full_userInfo) {
		super();
		this.full_bookingId = full_bookingId;
		this.username = username;
		this.full_passengersInfo = full_passengersInfo;
		this.busNumber = busNumber;
		this.source = source;
		this.destination = destination;
		this.numberOfSeats = numberOfSeats;
		this.amountPaid = amountPaid;
		this.datenm = datenm;
		this.journeyStartTime = journeyStartTime;
		this.journeyEndTime = journeyEndTime;
		this.full_userInfo = full_userInfo;
	}

	public full_booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "full_booking [full_bookingId=" + full_bookingId + ", username=" + username + ", full_passengersInfo="
				+ full_passengersInfo + ", busNumber=" + busNumber + ", source=" + source + ", destination="
				+ destination + ", numberOfSeats=" + numberOfSeats + ", amountPaid=" + amountPaid + ", datenm=" + datenm
				+ ", journeyStartTime=" + journeyStartTime + ", journeyEndTime=" + journeyEndTime + ", full_userInfo="
				+ full_userInfo + "]";
	}

	
	

}
