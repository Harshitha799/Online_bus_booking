package com.cg.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "user")
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@SequenceGenerator(name="userCounter",sequenceName="userSequence",initialValue=1)
	private long userId; 
	private String username;
	private String password;
	//private Map<Booking, FeedBack> bookingFeedbackInfo;
	
	@OneToMany(mappedBy="userInfo", cascade=  CascadeType.ALL)
	private List<Booking> bookingobj;

	public long getuserId() {
		return userId;
	}

	public void setuserId(long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Booking> getbookingobj() {
		return bookingobj;
	}

	public void setbookingobj(List<Booking> bookingobj) {
		this.bookingobj = bookingobj;
	}

	public User(long userId, String username, String password, List<Booking> bookingobj) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.bookingobj = bookingobj;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password
				+ ", booking=" + booking + "]";
	}

	

}
