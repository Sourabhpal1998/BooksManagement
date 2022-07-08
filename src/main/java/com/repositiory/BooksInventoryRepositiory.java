package com.repositiory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.BooksInventory;

@Repository
public interface BooksInventoryRepositiory extends JpaRepository<BooksInventory, Long> {

	BooksInventory findByBookName(String bookName);

}
