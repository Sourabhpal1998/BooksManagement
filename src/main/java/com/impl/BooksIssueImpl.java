package com.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.BooksInventory;
import com.entity.BooksIssue;
import com.repositiory.BooksInventoryRepositiory;
import com.repositiory.BooksIssueRepositiory;
import com.service.BooksIssueService;

@Service
public class BooksIssueImpl implements BooksIssueService {
	
	@Autowired
	private BooksIssueRepositiory booksIssueRepositiory;
	
	private BooksInventoryRepositiory booksInventoryRepositiory;

	

	@Override
	public BooksIssue saveIssueBooksDetails(BooksIssue booksIssue, String bookName) {
		BooksInventory booksInventory = booksInventoryRepositiory.findByBookName(bookName);
		int copy = booksInventory.getNumberOfCopies()-1;
		if(booksInventory.getNumberOfCopies()==0) {
			System.out.println("Out of Stock");
		}
		else {
			booksInventory.setNumberOfCopies(copy);
			booksIssueRepositiory.save(booksIssue);
		}
		return booksIssue;
	}

	

}
