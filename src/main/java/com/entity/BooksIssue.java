package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books_issue")
public class BooksIssue {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "name")
	private String Name;
	
	@Column(name = "book_name")
	private String bookName;
	
	@Column(name = "idenetity_number")
	private String identityNumber;
	
	public BooksIssue() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public BooksIssue(Long id, String name, String bookName, String identityNumber) {
		super();
		this.id = id;
		Name = name;
		this.bookName = bookName;
		this.identityNumber = identityNumber;
	}
	
	

}
