package com.cg.entityyy;

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
@Table(name = "full_user")
public class full_user 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@SequenceGenerator(name="full_userCounter",sequenceName="full_userSequence",initialValue=1)
	private long full_userId; 
	private String username;
	private String password;
	//private Map<full_booking, full_feedBack> full_bookingFeedbackInfo;
	
	@OneToMany(mappedBy="full_userInfo", cascade=  CascadeType.ALL)
	private List<full_booking> full_bookingobj1;

	public long getFull_userId() {
		return full_userId;
	}

	public void setFull_userId(long full_userId) {
		this.full_userId = full_userId;
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

	public List<full_booking> getFull_bookingobj1() {
		return full_bookingobj1;
	}

	public void setFull_bookingobj1(List<full_booking> full_bookingobj1) {
		this.full_bookingobj1 = full_bookingobj1;
	}

	public full_user(long full_userId, String username, String password, List<full_booking> full_bookingobj1) {
		super();
		this.full_userId = full_userId;
		this.username = username;
		this.password = password;
		this.full_bookingobj1 = full_bookingobj1;
	}

	public full_user() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "full_user [full_userId=" + full_userId + ", username=" + username + ", password=" + password
				+ ", full_bookingobj1=" + full_bookingobj1 + "]";
	}

	

}
