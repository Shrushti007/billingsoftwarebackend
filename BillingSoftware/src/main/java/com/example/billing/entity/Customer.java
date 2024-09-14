package com.example.billing.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  private String name;
  
  private String gender;
  
  private String contact;
  
  private String email;
  
  public Customer() {
	// TODO Auto-generated constructor stub
}

public Customer(Long id, String name, String gender, String contact, String email) {
	super();
	this.id = id;
	this.name = name;
	this.gender = gender;
	this.contact = contact;
	this.email = email;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getContact() {
	return contact;
}

public void setContact(String contact) {
	this.contact = contact;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

@Override
public String toString() {
	return "Customer [id=" + id + ", name=" + name + ", gender=" + gender + ", contact=" + contact + ", email=" + email
			+ "]";
}
  
  
}