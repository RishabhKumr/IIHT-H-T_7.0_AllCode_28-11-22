package com.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.entity.Book;

public interface IBookRepository extends JpaRepository<Book,Integer> {

}
