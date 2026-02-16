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
private int id;
private String name;
private long mob;
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
public long getMob() {
	return mob;
}
public void setMob(long mob) {
	this.mob = mob;
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
public DeliveryPartner(int id, String name, long mob, String mail, double rating, Address address, String disable,
		String vechile) {
	super();
	this.id = id;
	this.name = name;
	this.mob = mob;
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
	return "DeliveyPatner [id=" + id + ", name=" + name + ", mob=" + mob + ", mail=" + mail + ", rating=" + rating
			+ ", address=" + address + ", disable=" + disable + ", vechile=" + vechile + "]";
}




}
