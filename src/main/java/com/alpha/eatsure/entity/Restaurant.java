package com.alpha.eatsure.entity;

import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name = "restaurants")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private Long mobile;
    @Column(unique = true)
    private String email;
    @ManyToOne
    @JoinColumn(name="address_id")
    private Address address;

    private boolean open;
    private Double rating;
    private String description;
    private Double packagingFee;
    private String type;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "restaurant_id")
    private List<Items> menuItems;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "restaurant_id")
    private List<Orders> orders;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
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
	public List<Items> getMenuItems() {
		return menuItems;
	}
	public void setMenuItems(List<Items> menuItems) {
		this.menuItems = menuItems;
	}
	public List<Orders> getOrders() {
		return orders;
	}
	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
	public Restaurant(int id, String name, Long mobile, String email, Address address, boolean open, Double rating,
			String description, Double packagingFee, String type, List<Items> menuItems, List<Orders> orders) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
		this.open = open;
		this.rating = rating;
		this.description = description;
		this.packagingFee = packagingFee;
		this.type = type;
		this.menuItems = menuItems;
		this.orders = orders;
	}
	public Restaurant() {
		super();
	}
	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", name=" + name + ", mobile=" + mobile + ", email=" + email + ", address="
				+ address + ", open=" + open + ", rating=" + rating + ", description=" + description + ", packagingFee="
				+ packagingFee + ", type=" + type + ", menuItems=" + menuItems + ", orders=" + orders + "]";
	}
	
    
}