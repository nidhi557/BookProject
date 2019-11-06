package com.training;


import java.util.*;

public class BookManager {

	public List<Book> getAllBooks(){
		
		List<Book> bookList = new ArrayList<>();
		
		bookList.add(new Book(200,"Java Study"));
		return bookList;
	}
}
