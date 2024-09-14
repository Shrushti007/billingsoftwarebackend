package com.example.billing.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Billing {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @ManyToOne
  @JoinColumn(name = "customer_id")
  private Customer customer;
  
  @ManyToOne
  @JoinColumn(name = "product_id")
  private Product product;
  
  private Double totalAmount;
  
  public Billing() {
	// TODO Auto-generated constructor stub
}

public Billing(Long id, Customer customer, Product product, Double totalAmount) {
	super();
	this.id = id;
	this.customer = customer;
	this.product = product;
	this.totalAmount = totalAmount;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public Customer getCustomer() {
	return customer;
}

public void setCustomer(Customer customer) {
	this.customer = customer;
}

public Product getProduct() {
	return product;
}

public void setProduct(Product product) {
	this.product = product;
}

public Double getTotalAmount() {
	return totalAmount;
}

public void setTotalAmount(Double totalAmount) {
	this.totalAmount = totalAmount;
}

@Override
public String toString() {
	return "Billing [id=" + id + ", customer=" + customer + ", product=" + product + ", totalAmount=" + totalAmount
			+ "]";
}
  
  
  
}