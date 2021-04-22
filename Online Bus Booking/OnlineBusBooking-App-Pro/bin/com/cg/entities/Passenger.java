package com.cg.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.cg.entities.Booking;

@Entity
@Table(name = "passenger")
public class Passenger
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@SequenceGenerator(name="passengerCounter",sequenceName="passengerSequence",initialValue=1)
	private int passengerId;
	private String username;
	private String firstName;
	private String lastName;
	private long phoneNumber;
	private String email;
	private long identityDocNumber;
	private String identityDocumentName;

	@ManyToMany(mappedBy="passengersInfo", cascade = CascadeType.PERSIST)
	private Set<Booking> bookingobj;

	public int getpassengerId() {
		return passengerId;
	}

	public void setpassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getIdentityDocNumber() {
		return identityDocNumber;
	}

	public void setIdentityDocNumber(long identityDocNumber) {
		this.identityDocNumber = identityDocNumber;
	}

	public String getIdentityDocumentName() {
		return identityDocumentName;
	}

	public void setIdentityDocumentName(String identityDocumentName) {
		this.identityDocumentName = identityDocumentName;
	}

	public Set<Booking> getbookingobj() {
		return bookingobj;
	}

	public void setbookingobj(Set<Booking> bookingobj) {
		this.bookingobj = bookingobj;
	}

	public Passenger(int passengerId, String username, String firstName, String lastName, long phoneNumber,
			String email, long identityDocNumber, String identityDocumentName, Set<Booking> bookingobj) {
		super();
		this.passengerId = passengerId;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.identityDocNumber = identityDocNumber;
		this.identityDocumentName = identityDocumentName;
		this.bookingobj = bookingobj;
	}

	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Passenger [passengerId=" + passengerId + ", username=" + username + ", firstName="
				+ firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + ", email=" + email
				+ ", identityDocNumber=" + identityDocNumber + ", identityDocumentName=" + identityDocumentName
				+ ", booking=" + bookingobj + "]";
	}
	
	
}
