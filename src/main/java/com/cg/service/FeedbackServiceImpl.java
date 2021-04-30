package com.cg.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dto.FeedbackDto;
import com.cg.entity.BusOperator10;
import com.cg.entity.Feedback10;
import com.cg.entity.User10;
import com.cg.exception.InvalidRouteNameException;
import com.cg.repository.IBusOperator;
import com.cg.repository.IFeedBackRepository;
import com.cg.repository.IUserRepository;

@Service
public class FeedbackServiceImpl implements IFeedBackService{
	
	@Autowired
	IFeedBackRepository feedbackRepository;
	@Autowired
	IUserRepository userRepository;
	@Autowired
	IBusOperator busoperatorRepository;

//	@Override
//	public Feedback10 addFeedback(FeedbackDto feedbackdto) {
//		Feedback10 feedback=new Feedback10();
//		BusOperator10 busoperator=busoperatorRepository.findById(feedbackdto.getBusoperator()).get();
//		User10 user = userRepository.findById(feedbackdto.getUserId()).get();
//		feedback.setBusoperator(busoperator);
//		feedback.setUser(user);
//		feedback.setComments(feedbackdto.getComments());
//		feedback.setRatings(feedbackdto.getRatings());
//		feedback.setRouteName(feedbackdto.getRouteName());
//		feedback.setUsername(feedbackdto.getUsername());
//		return feedbackRepository.save(feedback);
//	}

	@Override
	public Feedback10 addFeedback(Feedback10 feedback) {
		
		return feedbackRepository.save(feedback);

	}

	@Override
	public List<Feedback10> viewAllFeedBacks(String routeName) {
		if(feedbackRepository.existsByRouteName(routeName)) {
			return feedbackRepository.findByRouteName(routeName);
		}
		else {
			throw new InvalidRouteNameException();
		}
	}

	@Override
	public List<Feedback10> viewAllFeedBacks(BusOperator10 busoperator) {
			return feedbackRepository.findByBusOperator(busoperator);	
	}

}