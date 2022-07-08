package com.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.BooksInventory;
import com.exception.ResourceNotFoundException;
import com.repositiory.BooksInventoryRepositiory;
import com.service.BooksInventoryService;

@Service
public class BooksInventoryImpl implements BooksInventoryService {
	
	@Autowired
	private BooksInventoryRepositiory booksInventoryRepositiory;

	@Override
	public BooksInventory saveBooks(BooksInventory booksInventory) {
		return booksInventoryRepositiory.save(booksInventory);
	}

	@Override
	public List<BooksInventory> listOfAllBooks() {
		return booksInventoryRepositiory.findAll();
	}

	@Override
	public String deleteBookInventory(Long id) {
		BooksInventory booksInventory = booksInventoryRepositiory.findById(id).orElseThrow(()-> new ResourceNotFoundException("Book Inventory id is invalid"));
		booksInventoryRepositiory.delete(booksInventory);
		return "Book Inventory Deleted";
	}

	@Override
	public BooksInventory updateInventory(Long id, BooksInventory booksInventory) {
		BooksInventory booksInventory2 = booksInventoryRepositiory.findById(id).orElseThrow(()-> new ResourceNotFoundException("Book Inventory id is invalid"));
		booksInventory2.setBookName(booksInventory.getBookName());
		booksInventory2.setStoreName(booksInventory.getStoreName());
		booksInventory2.setNumberOfCopies(booksInventory.getNumberOfCopies());
		booksInventoryRepositiory.save(booksInventory2);
		return booksInventory2;
	}

}
