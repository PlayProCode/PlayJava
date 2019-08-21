package com.db.dual.model.user;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/*
@Data
@AllArgsConstructor
@NoArgsConstructor*/
@Entity
@Table(name="User_DB")
public class User {

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + "]";
	}
	@Id
	private int id;
	private String userName;
	public User() {
	}
	public User(int id, String userName) {
		this.id = id;
		this.userName = userName;
	}
	
}
