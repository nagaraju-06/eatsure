package com.alpha.eatsure.dto;

public class CoordinatesDTO {
	private double longitude;
	private double latitude;
	public CoordinatesDTO(double longitude, double latitude) {
		super();
		this.longitude = longitude;
		this.latitude = latitude;
	}
	public CoordinatesDTO() {
		super();
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	

}
