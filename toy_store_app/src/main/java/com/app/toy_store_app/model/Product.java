package com.app.toy_store_app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="_product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;
private int quantityAvailable;
private double price;
public Product(Long id, String name, int quantityAvailable, double price) {
	super();
	this.id = id;
	this.name = name;
	this.quantityAvailable = quantityAvailable;
	this.price = price;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
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
public int getQuantityAvailable() {
	return quantityAvailable;
}
public void setQuantityAvailable(int quantityAvailable) {
	this.quantityAvailable = quantityAvailable;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

}
