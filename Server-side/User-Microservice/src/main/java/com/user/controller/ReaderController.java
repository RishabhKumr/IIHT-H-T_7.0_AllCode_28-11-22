package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.entity.Reader;
import com.user.repository.IReaderRepository;
import com.user.service.IReaderService;

@RestController
@RequestMapping("/reader")
public class ReaderController {
	
	@Autowired
	IReaderRepository readerRepository;
	
	@Autowired
	IReaderService readerService;

	
	@PostMapping("/addreader")
	public String addReader(@RequestBody Reader reader) {
		Reader readerCheck = readerRepository.findByReaderEmail(reader.getReaderEmail());
		String email = null;
		if(readerCheck != null)
		{
			email= "Email already exists";
		}
		else 
		{
		email = readerService.createReader(reader);
		}
		return email;
	}

}
