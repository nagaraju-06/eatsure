package com.alpha.eatsure.dto;



public class RestaurantDto{
	
	    private String name;
	    private Long phone;
	    private String email;
	    private LocationCordinates cordinates;
	    private String description;
	    private Double packagefees;
	   
		private String type;

		
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

		public LocationCordinates getCordinates() {
			return cordinates;
		}

		public void setCordinates(LocationCordinates cordinates) {
			this.cordinates = cordinates;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Double getPackagefees() {
			return packagefees;
		}


		public void setPackagefees(Double packagefees) {
			this.packagefees = packagefees;
		}


		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}


public RestaurantDto(String name, Long phone, String email, LocationCordinates cordinates, String description,
		Double packagefees, String type) {
			super();
			this.name = name;
			this.phone = phone;
			this.email = email;
			this.cordinates = cordinates;
			this.description = description;
			this.packagefees = packagefees;
			this.type = type;
		}



		public RestaurantDto() {
			super();
			// TODO Auto-generated constructor stub
		}
		
}





