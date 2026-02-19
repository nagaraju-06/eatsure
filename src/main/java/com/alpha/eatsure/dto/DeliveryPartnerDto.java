package com.alpha.eatsure.dto;



public class DeliveryPartnerDto {
	
	 private String name;
	 private Long phone;
	 private String email;
	 private String vehicleno;
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public Long getPhone() {
		 return phone;
	 }
	 public void setPhone(Long phone) {
		 this.phone = phone;
	 }
	 public String getEmail() {
		 return email;
	 }
	 public void setEmail(String email) {
		 this.email = email;
	 }
	 public String getVehicleno() {
		 return vehicleno;
	 }
	 public void setVehicleno(String vehicleno) {
		 this.vehicleno = vehicleno;
	 }
	 public DeliveryPartnerDto(String name, Long phone, String email, String vehicleno) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.vehicleno = vehicleno;
	 }
	 public DeliveryPartnerDto() {
		super();
	 }
	 
	 
}

