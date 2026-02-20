package com.alpha.eatsure.restaurant.dto;

public class RestaurantRequestDto {

    private String name;
    private String mobile;
    private String email;
    private String description;
    private Double packagingFee;
    private String type;
    private Double latitude;
    private Double longitude;


    public RestaurantRequestDto() {
    }


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
}
