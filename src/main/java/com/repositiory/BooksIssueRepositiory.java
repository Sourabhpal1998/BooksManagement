package com.repositiory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.BooksIssue;

@Repository
public interface BooksIssueRepositiory extends JpaRepository<BooksIssue, Long> {

}
