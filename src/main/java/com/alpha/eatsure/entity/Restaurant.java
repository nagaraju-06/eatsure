package com.alpha.eatsure.entity;

import java.util.List;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

import jakarta.persistence.*;

@Entity
@Table(name = "restaurants")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String mobile;
    private String email;
    private String address;

    private boolean open;
    private Double rating;
    private String description;
    private Double packagingFee;
    private String type;

    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL)
    private List<Item> menuItems;

    public Restaurant() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
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

    public List<Item> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<Item> menuItems) {
        this.menuItems = menuItems;
    }

	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", name=" + name + ", mobile=" + mobile + ", email=" + email + ", address="
				+ address + ", open=" + open + ", rating=" + rating + ", description=" + description + ", packagingFee="
				+ packagingFee + ", type=" + type + "]";
	}
}
