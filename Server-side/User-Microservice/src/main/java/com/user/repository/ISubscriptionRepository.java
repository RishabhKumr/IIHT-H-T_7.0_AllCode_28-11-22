package com.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.entity.Subscription;

@Repository
public interface ISubscriptionRepository extends JpaRepository<Subscription,Integer>{
	
	public List<Subscription> findByUserIdAndBookId(int userId,int bookId);
	public List<Subscription> findByUserId(int userId);

}
