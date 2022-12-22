package com.user.service;

import java.util.List;

import com.user.entity.book.Book;

public interface IBlockService {
	public String addBlock(int userId,int bookId);
	
	public Boolean getBooksByUserIdBookId(int userId,int bookId);

}
