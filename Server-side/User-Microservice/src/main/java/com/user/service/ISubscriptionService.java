package com.user.service;

public interface ISubscriptionService {
	
	public int createSubcription(int userId,int bookId);
	
	public String deleteSubscripton(int subscriptionId);
	 
	public int getSubscriptionIdbyUserIdBookId(int userId,int bookId);
	
}