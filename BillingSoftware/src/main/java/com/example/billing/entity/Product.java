package com.example.billing.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  private String name;
  
  private Double price;
  
  private Integer quantity;
  
  private String brand;
  
  private String supplier;
  
  private String category;
  
  public Product() {
	// TODO Auto-generated constructor stub
}

public Product(Long id, String name, Double price, Integer quantity, String brand, String supplier, String category) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	this.quantity = quantity;
	this.brand = brand;
	this.supplier = supplier;
	this.category = category;
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

public Double getPrice() {
	return price;
}

public void setPrice(Double price) {
	this.price = price;
}

public Integer getQuantity() {
	return quantity;
}

public void setQuantity(Integer quantity) {
	this.quantity = quantity;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public String getSupplier() {
	return supplier;
}

public void setSupplier(String supplier) {
	this.supplier = supplier;
}

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}

@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", brand=" + brand
			+ ", supplier=" + supplier + ", category=" + category + "]";
}
  
}