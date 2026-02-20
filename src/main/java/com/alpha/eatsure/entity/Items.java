package com.alpha.eatsure.entity;

//import org.hibernate.annotations.CascadeType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;

@Entity
public class Items {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String name;
	private String descrption;
	private double price;
	private String unit;
	private String type;
	private boolean availability;
	public double rating;

	@ManyToOne
	@JoinColumn(name = "restaurant_id")
	private Restaurant restaurant;
//
//	@Lob
//	private byte[] image;

	private int numberOfServes;

	public Items() {
	}

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

	public String getDescrption() {
		return descrption;
	}

	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
//
//	public byte[] getImage() {
//		return image;
//	}
//
//	public void setImage(byte[] image) {
//		this.image = image;
//	}

	public int getNumberOfServes() {
		return numberOfServes;
	}

	public void setNumberOfServes(int numberOfServes) {
		this.numberOfServes = numberOfServes;
	}
	

	public Items(int id, String name, String descrption, double price, String unit, String type, boolean availability,
			double rating, Restaurant restaurant, int numberOfServes) {
		super();
		this.id = id;
		this.name = name;
		this.descrption = descrption;
		this.price = price;
		this.unit = unit;
		this.type = type;
		this.availability = availability;
		this.rating = rating;
		this.restaurant = restaurant;
		this.numberOfServes = numberOfServes;
	}

	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + ", descrption=" + descrption + ", price=" + price + ", unit="
				+ unit + ", type=" + type + ", availability=" + availability + ", rating=" + rating
				+ ", numberOfServes=" + numberOfServes + "]";
	}
}
