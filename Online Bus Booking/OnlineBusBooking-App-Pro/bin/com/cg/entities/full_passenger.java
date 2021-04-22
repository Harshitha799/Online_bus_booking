package com.cg.entityyy;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.cg.entityyy.full_booking;

@Entity
@Table(name = "full_passenger")
public class full_passenger
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@SequenceGenerator(name="full_passengerCounter",sequenceName="full_passengerSequence",initialValue=1)
	private int full_passengerId;
	private String username;
	private String firstName;
	private String lastName;
	private long phoneNumber;
	private String email;
	private long identityDocNumber;
	private String identityDocumentName;

	@ManyToMany(mappedBy="full_passengersInfo", cascade = CascadeType.PERSIST)
	private Set<full_booking> full_bookingobj;

	public int getFull_passengerId() {
		return full_passengerId;
	}

	public void setFull_passengerId(int full_passengerId) {
		this.full_passengerId = full_passengerId;
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

	public Set<full_booking> getFull_bookingobj() {
		return full_bookingobj;
	}

	public void setFull_bookingobj(Set<full_booking> full_bookingobj) {
		this.full_bookingobj = full_bookingobj;
	}

	public full_passenger(int full_passengerId, String username, String firstName, String lastName, long phoneNumber,
			String email, long identityDocNumber, String identityDocumentName, Set<full_booking> full_bookingobj) {
		super();
		this.full_passengerId = full_passengerId;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.identityDocNumber = identityDocNumber;
		this.identityDocumentName = identityDocumentName;
		this.full_bookingobj = full_bookingobj;
	}

	public full_passenger() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "full_passenger [full_passengerId=" + full_passengerId + ", username=" + username + ", firstName="
				+ firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + ", email=" + email
				+ ", identityDocNumber=" + identityDocNumber + ", identityDocumentName=" + identityDocumentName
				+ ", full_bookingobj=" + full_bookingobj + "]";
	}
	
	
}
