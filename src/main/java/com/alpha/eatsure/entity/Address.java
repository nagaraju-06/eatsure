package com.alpha.eatsure.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="address")
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
	 private String pincode;
	 private String state;
	 private String country;
	 private String street;
	 private String landmark;
	 private String adresstype;
	 private Boolean isDefault;
	  @ManyToOne
	    @JoinColumn(name="customer_id")
	    private Customer customer;
	  public Integer getId() {
		  return id;
	  }
	  public void setId(Integer id) {
		  this.id = id;
	  }
	  public double getLatitude() {
		  return latitude;
	  }
	  public void setLatitude(double latitude) {
		  this.latitude = latitude;
	  }
	  public double getLongitude() {
		  return longitude;
	  }
	  public void setLongitude(double longitude) {
		  this.longitude = longitude;
	  }
	  public String getFlatnumber() {
		  return flatnumber;
	  }
	  public void setFlatnumber(String flatnumber) {
		  this.flatnumber = flatnumber;
	  }
	  public String getFloor() {
		  return floor;
	  }
	  public void setFloor(String floor) {
		  this.floor = floor;
	  }
	  public String getArea() {
		  return area;
	  }
	  public void setArea(String area) {
		  this.area = area;
	  }
	  public String getDistrict() {
		  return district;
	  }
	  public void setDistrict(String district) {
		  this.district = district;
	  }
	  public String getCity() {
		  return city;
	  }
	  public void setCity(String city) {
		  this.city = city;
	  }
	  public String  getPincode() {
		  return pincode;
	  }
	  public void setPincode(String pincode) {
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
	  public String getAdresstype() {
		  return adresstype;
	  }
	  public void setAdresstype(String adresstype) {
		  this.adresstype = adresstype;
	  }
	  public Boolean getIsDefault() {
		  return isDefault;
	  }
	  public void setIsDefault(Boolean isDefault) {
		  this.isDefault = isDefault;
	  }
	  public Customer getCustomer() {
		  return customer;
	  }
	  public void setCustomer(Customer customer) {
		  this.customer = customer;
	  }
	  @Override
	  public String toString() {
		return "Address [id=" + id + ", latitude=" + latitude + ", longitude=" + longitude + ", flatnumber="
				+ flatnumber + ", floor=" + floor + ", area=" + area + ", district=" + district + ", city=" + city
				+ ", pincode=" + pincode + ", state=" + state + ", country=" + country + ", street=" + street
				+ ", landmark=" + landmark + ", adresstype=" + adresstype + ", isDefault=" + isDefault + ", customer="
				+ customer + "]";
	  }
	  public Address(Integer id, double latitude, double longitude, String flatnumber, String floor, String area,
			String district, String city, String pincode, String state, String country, String street, String landmark,
			String adresstype, Boolean isDefault, Customer customer) {
		super();
		this.id = id;
		this.latitude = latitude;
		this.longitude = longitude;
		this.flatnumber = flatnumber;
		this.floor = floor;
		this.area = area;
		this.district = district;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
		this.country = country;
		this.street = street;
		this.landmark = landmark;
		this.adresstype = adresstype;
		this.isDefault = isDefault;
		this.customer = customer;
	  }
	  public Address() {
		super();
	  }
	   
		
}

