package com.alpha.eatsure.dto;



public class CustomerDto {
	   private String name;
	   private Long phone;
	   private String email;
	   private String gender;
	   public CustomerDto(String name, Long phone, String email, String gender) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.gender = gender;
	   }
	   public CustomerDto() {
		super();
		// TODO Auto-generated constructor stub
	   }
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
	   public String getGender() {
		   return gender;
	   }
	   public void setGender(String gender) {
		   this.gender = gender;
	   }

}
