package com.alpha.eatsure.dto;

import com.alpha.eatsure.special.Location;

public class RestaurantRequestDto {

    private String name;
    private String mobile;
    private String email;
    private String description;
    private Double packagingFee;
    private String type;
    private Location locationCordinate=null;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPackagingFee() {
		return packagingFee;
	}
	public void setPackagingFee(Double packagingFee) {
		this.packagingFee = packagingFee;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Location getLocationCordinate() {
		return locationCordinate;
	}
	public void setLocationCordinate(Location locationCordinate) {
		this.locationCordinate = locationCordinate;
	}
	public RestaurantRequestDto(String name, String mobile, String email, String description, Double packagingFee,
			String type, Location locationCordinate) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.description = description;
		this.packagingFee = packagingFee;
		this.type = type;
		this.locationCordinate = locationCordinate;
	}
	public RestaurantRequestDto() {
		super();
	}

    
   
	
}
