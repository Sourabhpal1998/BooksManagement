package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.BooksInventory;
import com.service.BooksInventoryService;

@RestController
public class BooksInventoryController {
	
	@Autowired
	private BooksInventoryService booksInventoryService;
	
	@PostMapping("/save/books/inventory")
    public BooksInventory saveBooks(@RequestBody BooksInventory booksInventory) {
    	return booksInventoryService.saveBooks(booksInventory);
    }
	
	@GetMapping("/list/of/all/books")
	public List<BooksInventory> listOfAllBooks(){
		return booksInventoryService.listOfAllBooks();
	}
	
	@DeleteMapping("/delete/book/inventory")
	public String deleteBookInventory(@PathVariable Long id) {
		return booksInventoryService.deleteBookInventory(id);
	}
	
	@PutMapping("/update/book/inventory")
	public BooksInventory updateInventory(@PathVariable Long id, @RequestBody BooksInventory booksInventory) {
		return booksInventoryService.updateInventory(id, booksInventory);
	}


}
