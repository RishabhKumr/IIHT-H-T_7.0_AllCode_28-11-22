package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.entity.book.Book;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {
	@Autowired
	private RestTemplate restTemplate;
	
  @GetMapping("/all")
  public List<Book> allAccess() {
    List book = this.restTemplate.getForObject("http://localhost:8082/book/allBooks", List.class);
    return book;
  }

  @GetMapping("/user")
  @PreAuthorize("hasRole('ROLE_READER') or hasRole('ROLE_AUTHOR')")
  public String userAccess() {
    return "User Content.";
  }
  
  @GetMapping("/guest")
  @PreAuthorize("hasRole('ROLE_GUEST')")
  public String guestAccess() {
    return "Moderator Board.";
  }

  @GetMapping("/author")
  @PreAuthorize("hasRole('ROLE_AUTHOR')")
  public String authorAccess() {
    return "Moderator Board.";
  }

  @GetMapping("/reader")
  @PreAuthorize("hasRole('ROLE_READER')")
  public String readerAccess() {
    return "Admin Board.";
  }
  
  @GetMapping("/search/{bookTitle}")
  public List<Book> getBookBytitle(@PathVariable String bookTitle){
	  String url = "http://localhost:8082/book/title"+"/"+bookTitle;
	  List book = this.restTemplate.getForObject(url, List.class);
	    return book;
  }
}