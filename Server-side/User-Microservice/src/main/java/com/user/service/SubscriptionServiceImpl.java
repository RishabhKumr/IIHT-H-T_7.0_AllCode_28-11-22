package com.user.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.entity.Subscription;
import com.user.repository.ISubscriptionRepository;

@Service
public class SubscriptionServiceImpl implements ISubscriptionService{

	@Autowired
	ISubscriptionRepository subscriptionRepo;
	
	@Override
	public int createSubcription(int userId, int bookId) {
		Subscription subscribe = new Subscription();
		subscribe.setUserId(userId);
		subscribe.setBookId(bookId);
		LocalDateTime date = LocalDateTime.now();
		subscribe.setDate(String.valueOf(date));
		subscriptionRepo.save(subscribe);
		return subscribe.getSubscriptionId();
	}

	@Override
	public String deleteSubscripton(int subscriptionId) {
		Optional<Subscription> subscribe = null;
		subscribe = subscriptionRepo.findById(subscriptionId);
		Subscription subsObj = subscribe.get();
		LocalDateTime date = LocalDateTime.parse(String.valueOf(LocalDateTime.now()));
		LocalDateTime dbTime = LocalDateTime.parse(String.valueOf(subsObj.getDate()));
	    long timeDiff = java.time.Duration.between(date,dbTime).toHours();
	    if(Math.abs(timeDiff) < 24) {
		subscriptionRepo.deleteById(subscriptionId);
		return "Subscription cancelled!";
	    }
	    else {
	    	return "Subscription cannot be cancelled post 24 hours";
	    }
		
	}

	@Override
	public int getSubscriptionIdbyUserIdBookId(int userId, int bookId) {
		
		List<Subscription> subscriber = subscriptionRepo.findByUserIdAndBookId(userId, bookId);
		Subscription subscriberObj = subscriber.get(0);
		return subscriberObj.getSubscriptionId();
	}
	

}
