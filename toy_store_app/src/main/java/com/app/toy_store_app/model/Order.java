package com.app.toy_store_app.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="_order")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
private Date dateoforder;
private String toyname;
private int toyprice;
private int quantity;
public Order(Long id, Date dateoforder, String toyname, int toyprice, int quantity) {
	super();
	this.id = id;
	this.dateoforder = dateoforder;
	this.toyname = toyname;
	this.toyprice = toyprice;
	this.quantity = quantity;
}
public Order() {
	super();
	// TODO Auto-generated constructor stub
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Date getDateoforder() {
	return dateoforder;
}
public void setDateoforder(Date dateoforder) {
	this.dateoforder = dateoforder;
}
public String getToyname() {
	return toyname;
}
public void setToyname(String toyname) {
	this.toyname = toyname;
}
public int getToyprice() {
	return toyprice;
}
public void setToyprice(int toyprice) {
	this.toyprice = toyprice;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}



}
