package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books_inventory")
public class BooksInventory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "book_name")
	private String bookName;
	
	@Column(name = "store_name")
	private String storeName;
	
	@Column(name = "number_of_copies")
	private int numberOfCopies;
	
	
	public BooksInventory() {
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public String getStoreName() {
		return storeName;
	}


	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}


	public int getNumberOfCopies() {
		return numberOfCopies;
	}


	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}


	public BooksInventory(Long id, String bookName, String storeName, int numberOfCopies) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.storeName = storeName;
		this.numberOfCopies = numberOfCopies;
	}

	
	
}
