package com.cg.service;

import java.util.List;

import com.cg.entities.BusOperator;
import com.cg.entities.FeedBack;

public interface IFeedBackService {
	
	public FeedBack addFeedback(FeedBack feedback);
	public List<FeedBack> viewAllFeedBacks(String routeName,BusOperator operator);
	public List<FeedBack> viewAllFeedBacks(BusOperator operator);
	
	
}
