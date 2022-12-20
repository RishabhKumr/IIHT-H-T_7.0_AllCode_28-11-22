package com.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.entity.Author;

@Repository
public interface IAuthorRepository  extends JpaRepository<Author,Integer>{
	Author findByAuthorEmail(String email);
}
