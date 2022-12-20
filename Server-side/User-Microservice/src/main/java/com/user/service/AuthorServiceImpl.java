package com.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.entity.Author;
import com.user.repository.IAuthorRepository;

@Service
public class AuthorServiceImpl  implements IAuthorService{
	
	@Autowired
	IAuthorRepository authorRepository;

	@Override
	public String createAuthor(Author author) {
		Author addAuthor = null;
		try
		{
			addAuthor = authorRepository.save(author);
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		return addAuthor.getAuthorEmail();
	}
	
}
