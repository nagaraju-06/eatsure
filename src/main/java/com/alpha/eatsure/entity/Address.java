package com.alpha.eatsure.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
     private Integer id;
	private double latitude;
	private double longitude;
	private String flatnumber;
	private String floor;
	private String area;
	private String district;
	
	 private String city;
	 private int pincode;
	 private String state;
	 private String country;
	 private String street;
	 private String landmark;
	 private String adresstype;
	 
	 
	
	 
	 
}

