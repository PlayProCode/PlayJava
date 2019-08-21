package com.db.dual.model.book;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*@Data
@AllArgsConstructor
@NoArgsConstructor*/
@Entity
@Table(name="Book_DB")
public class Book {

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + "]";
	}
	public Book(int id, String bookName) {
		this.id=id;
		this.bookName=bookName;
	}
	public Book() {
	}
	@Id
	private int id;
	private String bookName;
	
}
