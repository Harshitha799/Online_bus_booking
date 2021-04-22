package com.cg.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.entities.BusOperator;
import com.cg.entities.FeedBack;

@Service
public interface IFeedBackService {
	
	public FeedBack addFeedback(FeedBack feedback);
	public List<FeedBack> viewAllFeedBacks(String routeName,BusOperator operator);
	public List<FeedBack> viewAllFeedBacks(BusOperator operator);
	
	
}
