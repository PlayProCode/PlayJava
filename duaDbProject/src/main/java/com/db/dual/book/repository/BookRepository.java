package com.db.dual.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.db.dual.model.book.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
