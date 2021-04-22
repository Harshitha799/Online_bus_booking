package com.cg.repository;

import java.util.List;

import com.cg.entities.BusOperator;
import com.cg.entities.FeedBack;

public interface IFeedBackRepository extends JpaRepository<Feedback, Integer> {
	
	public FeedBack addFeedback(FeedBack feedback);
	public List<FeedBack> viewAllFeedBacks(String routeName,BusOperator operator);
	public List<FeedBack> viewAllFeedBacks(BusOperator operator);
	
	
}
