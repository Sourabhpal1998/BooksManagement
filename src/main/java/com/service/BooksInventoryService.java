package com.service;

import java.util.List;

import com.entity.BooksInventory;

public interface BooksInventoryService {
	
	public BooksInventory saveBooks(BooksInventory booksInventory);
	
	public List<BooksInventory> listOfAllBooks();
	
	public String deleteBookInventory(Long id);
	
	public BooksInventory updateInventory(Long id, BooksInventory booksInventory);

}
