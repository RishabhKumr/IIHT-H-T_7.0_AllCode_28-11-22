package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.entity.Author;
import com.user.repository.IAuthorRepository;
import com.user.service.IAuthorService;

@RestController
@RequestMapping("/author")
public class AuthorController {
	@Autowired
	IAuthorRepository authorRepository;
	
	@Autowired
	IAuthorService authorService;
	
	@PostMapping("/addauthor")
	public String addAuthor(@RequestBody Author author) {
		Author existAuthor = authorRepository.findByAuthorEmail(author.getAuthorEmail());
		String email = null;
		if(existAuthor != null) {
			email = "Email already exist!";
		}
		else
		{
			email = authorService.createAuthor(author);
		}
		return email;
	}
}
