package com.alpha.eatsure.entity;

import jakarta.persistence.*;

@Entity
public class Items {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private Double price;
    private String description;
    private String type;
    private String Availability;
    private double Rating;
    private String image;
    private int Noofservices;
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
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAvailability() {
		return Availability;
	}
	public void setAvailability(String availability) {
		Availability = availability;
	}
	public double getRating() {
		return Rating;
	}
	public void setRating(double rating) {
		Rating = rating;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getNoofservices() {
		return Noofservices;
	}
	public void setNoofservices(int noofservices) {
		Noofservices = noofservices;
	}
	public Items(int id, String name, Double price, String description, String type, String availability,
			double rating, String image, int noofservices) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.type = type;
		Availability = availability;
		Rating = rating;
		this.image = image;
		Noofservices = noofservices;
	}
	public Items() {
		super();
	}
	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + ", price=" + price + ", description=" + description + ", type="
				+ type + ", Availability=" + Availability + ", Rating=" + Rating + ", image=" + image
				+ ", Noofservices=" + Noofservices + "]";
	}
    

   

   
}