package com.cg.dto;

/*********************************************************************
 * 
 * @author Prithviraj V 
 * Version: 1.0 
 * Date: 20-04-2021 
 * Description: This is the dto class of the Feedback module
 *
 *********************************************************************/

public class FeedbackDto {
	
	private int ratings;
	private String comments;
	private String username;
	private String routeName;
	private Long userId;
	private Integer busoperator;
	public int getRatings() {
		return ratings;
	}
	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRouteName() {
		return routeName;
	}
	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Integer getBusoperator() {
		return busoperator;
	}
	public void setBusoperator(Integer busoperator) {
		this.busoperator = busoperator;
	}
	public FeedbackDto(int ratings, String comments, String username, String routeName, Long userId,
			Integer busoperator) {
		super();
		this.ratings = ratings;
		this.comments = comments;
		this.username = username;
		this.routeName = routeName;
		this.userId = userId;
		this.busoperator = busoperator;
	}
	public FeedbackDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}