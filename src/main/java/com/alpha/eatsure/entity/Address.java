package com.alpha.eatsure.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
     private int id;
	 private String city;
	 private int pincode;
	 private String state;
	 private String country;
	 private String street;
	 private String landmark;
	  private Double latitude;
	    private Double longitude;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public int getPincode() {
			return pincode;
		}
		public void setPincode(int pincode) {
			this.pincode = pincode;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getStreet() {
			return street;
		}
		public void setStreet(String street) {
			this.street = street;
		}
		public String getLandmark() {
			return landmark;
		}
		public void setLandmark(String landmark) {
			this.landmark = landmark;
		}
		public Double getLatitude() {
			return latitude;
		}
		public void setLatitude(Double latitude) {
			this.latitude = latitude;
		}
		public Double getLongitude() {
			return longitude;
		}
		public void setLongitude(Double longitude) {
			this.longitude = longitude;
		}
		public Address(int id, String city, int pincode, String state, String country, String street, String landmark,
				Double latitude, Double longitude) {
			super();
			this.id = id;
			this.city = city;
			this.pincode = pincode;
			this.state = state;
			this.country = country;
			this.street = street;
			this.landmark = landmark;
			this.latitude = latitude;
			this.longitude = longitude;
		}
		public Address() {
			super();
		}
		@Override
		public String toString() {
			return "Address [id=" + id + ", city=" + city + ", pincode=" + pincode + ", state=" + state + ", country="
					+ country + ", street=" + street + ", landmark=" + landmark + ", latitude=" + latitude
					+ ", longitude=" + longitude + "]";
		}
	 
	 
	 
	 
	 
	 
}

