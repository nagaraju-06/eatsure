package com.alpha.eatsure.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class DeliveryPartner {
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
private Integer id;
private String name;
private long phone;
private String mail;
private double rating;
@ManyToOne
private Address address;
private String disable;
private String vechile;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getphone() {
	return phone;
}
public void setphone(long phone) {
	this.phone = phone;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public double getRating() {
	return rating;
}
public void setRating(double rating) {
	this.rating = rating;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public String getDisable() {
	return disable;
}
public void setDisable(String disable) {
	this.disable = disable;
}
public String getVechile() {
	return vechile;
}
public void setVechile(String vechile) {
	this.vechile = vechile;
}
public DeliveryPartner(int id, String name, long phone, String mail, double rating, Address address, String disable,
		String vechile) {
	super();
	this.id = id;
	this.name = name;
	this.phone = phone;
	this.mail = mail;
	this.rating = rating;
	this.address = address;
	this.disable = disable;
	this.vechile = vechile;
}
public DeliveryPartner() {
	super();
}
@Override
public String toString() {
	return "DeliveyPatner [id=" + id + ", name=" + name + ", phone=" + phone + ", mail=" + mail + ", rating=" + rating
			+ ", address=" + address + ", disable=" + disable + ", vechile=" + vechile + "]";
}




}
