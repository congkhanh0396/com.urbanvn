package com.urbanvn.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employees")
public class Employees {
	@Id
	private String username;
	private String name;
	private String password;
	private String role;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Employees(String username, String name, String password, String role) {
		super();
		this.username = username;
		this.name = name;
		this.password = password;
		this.role = role;
	}

	public Employees() {
		super();
	}

}
