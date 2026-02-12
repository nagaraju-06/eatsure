package com.alpha.eatsure.entity;

import java.util.Arrays;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Items {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int id;
	private String name;
	private String descrption;
	private double price;
	private String unit;
	private String type;
	private boolean availability;
	public double rating;
	@Lob
	private byte[] image;
	   private int numberOfServes;
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
	   public byte[] getImage() {
		   return image;
	   }
	   public void setImage(byte[] image) {
		   this.image = image;
	   }
	   public int getNumberOfServes() {
		   return numberOfServes;
	   }
	   public void setNumberOfServes(int numberOfServes) {
		   this.numberOfServes = numberOfServes;
	   }
	   public Items(int id, String name, String descrption, double price, String unit, String type, boolean availability,
			double rating, byte[] image, int numberOfServes) {
		super();
		this.id = id;
		this.name = name;
		this.descrption = descrption;
		this.price = price;
		this.unit = unit;
		this.type = type;
		this.availability = availability;
		this.rating = rating;
		this.image = image;
		this.numberOfServes = numberOfServes;
	   }
	   public Items() {
		super();
	   }
	   @Override
	   public String toString() {
		return "Items [id=" + id + ", name=" + name + ", descrption=" + descrption + ", price=" + price + ", unit="
				+ unit + ", type=" + type + ", availability=" + availability + ", rating=" + rating + ", image="
				+ Arrays.toString(image) + ", numberOfServes=" + numberOfServes + "]";
	   }
	   
}
