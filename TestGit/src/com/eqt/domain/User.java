package com.eqt.domain;

public class User {
	
	private String username = "";
	private String email = "";
	private String description = "";
	private String description2 = "";
	private String description3 = "";
	private String data = "";
	private String data2 = "";	
	
	public static void main(String[] args) {
		
		User user = new User();
		user.setUsername("Bob");
		
		System.out.println(user);
		
	}
	
	
	public String getDescription3() {
		return description3;
	}
	public void setDescription3(String description3) {
		this.description3 = description3;
	}
	public String getDescription2() {
		return description2;
	}
	public void setDescription2(String description2) {
		this.description2 = description2;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	private Address address = null;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "User [username=" + username + ", email=" + email + ", description=" + description + ", description2="
				+ description2 + ", description3=" + description3 + ", data=" + data + ", data2=" + data2 + ", address="
				+ address + "]";
	}
			

}
