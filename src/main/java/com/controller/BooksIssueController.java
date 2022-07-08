package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.BooksIssue;
import com.service.BooksIssueService;

@RestController
public class BooksIssueController {
	
	@Autowired
	private BooksIssueService booksIssueService;
	
	
	@PostMapping("/save/issue/book/details")
	public BooksIssue saveIssueBooksDetails(BooksIssue booksIssue, String bookName) {
		return booksIssueService.saveIssueBooksDetails(booksIssue, bookName);
	}

}
