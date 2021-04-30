package com.cg.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.dto.FeedbackDto;
import com.cg.entity.BusOperator10;
import com.cg.entity.Feedback10;

@Service
public interface IFeedBackService {
	
	public Feedback10 addFeedback(FeedbackDto feedback);
	//public Feedback10 addFeedback(Feedback10 feedback);
	
	public List<Feedback10> viewAllFeedBacks(String routeName);
	
	public List<Feedback10> viewAllFeedBacks(BusOperator10 busoperator);
	
	
}