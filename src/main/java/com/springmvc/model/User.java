package com.springmvc.model;

public class User {
	private String name;
	private String email;
	private String password;
	private String conpassword;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String name, String email, String password, String conpassword) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.conpassword = conpassword;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConpassword() {
		return conpassword;
	}
	public void setConpassword(String conpassword) {
		this.conpassword = conpassword;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", password=" + password + ", conpassword=" + conpassword
				+ "]";
	}
	
}
