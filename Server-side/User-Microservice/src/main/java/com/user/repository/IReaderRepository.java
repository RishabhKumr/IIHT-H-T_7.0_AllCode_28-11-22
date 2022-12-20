package com.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.user.entity.Reader;

@Repository
public interface IReaderRepository  extends JpaRepository<Reader,Integer>{
	public Reader findByReaderEmail(String readerEmail);
}
