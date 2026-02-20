package com.alpha.eatsure.entity;

import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Orders {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private int id;

	    private String status;

	    @ManyToOne
	    @JoinColumn(name = "restaurant_id")
	    private Restaurant restaurant;

	    @ManyToOne
	    @JoinColumn(name = "customer_id")
	    private Customer customer;

	    private int cost;

	    @OneToMany(cascade = CascadeType.ALL)
	    @JoinColumn(name = "order_id")
	    private List<Items> items;

	    private String pickupAddress;
	    private String deliveryAddress;
	    private int otp;

	    @ManyToOne
	    @JoinColumn(name = "delivery_partner_id")
	    private DeliveryPartner delpat;

	    @OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "payment_id")
	    private Payment pay;

	    private int estimatetime;
	    private double distance;
	    private int discount;
	    private int coupones;
	    private String specialrequest;
	    private String deliveryinstuction;
	    private int date;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public Restaurant getRestaurant() {
			return restaurant;
		}
		public void setRestaurant(Restaurant restaurant) {
			this.restaurant = restaurant;
		}
		public Customer getCustomer() {
			return customer;
		}
		public void setCustomer(Customer customer) {
			this.customer = customer;
		}
		public int getCost() {
			return cost;
		}
		public void setCost(int cost) {
			this.cost = cost;
		}
		public List<Items> getItems() {
			return items;
		}
		public void setItems(List<Items> items) {
			this.items = items;
		}
		public String getPickupAddress() {
			return pickupAddress;
		}
		public void setPickupAddress(String pickupAddress) {
			this.pickupAddress = pickupAddress;
		}
		public String getDeliveryAddress() {
			return deliveryAddress;
		}
		public void setDeliveryAddress(String deliveryAddress) {
			this.deliveryAddress = deliveryAddress;
		}
		public int getOtp() {
			return otp;
		}
		public void setOtp(int otp) {
			this.otp = otp;
		}
		public DeliveryPartner getDelpat() {
			return delpat;
		}
		public void setDelpat(DeliveryPartner delpat) {
			this.delpat = delpat;
		}
		public Payment getPay() {
			return pay;
		}
		public void setPay(Payment pay) {
			this.pay = pay;
		}
		public int getEstimatetime() {
			return estimatetime;
		}
		public void setEstimatetime(int estimatetime) {
			this.estimatetime = estimatetime;
		}
		public double getDistance() {
			return distance;
		}
		public void setDistance(double distance) {
			this.distance = distance;
		}
		public int getDiscount() {
			return discount;
		}
		public void setDiscount(int discount) {
			this.discount = discount;
		}
		public int getCoupones() {
			return coupones;
		}
		public void setCoupones(int coupones) {
			this.coupones = coupones;
		}
		public String getSpecialrequest() {
			return specialrequest;
		}
		public void setSpecialrequest(String specialrequest) {
			this.specialrequest = specialrequest;
		}
		public String getDeliveryinstuction() {
			return deliveryinstuction;
		}
		public void setDeliveryinstuction(String deliveryinstuction) {
			this.deliveryinstuction = deliveryinstuction;
		}
		public int getDate() {
			return date;
		}
		public void setDate(int date) {
			this.date = date;
		}
		public Orders(int id, String status, Restaurant restaurant, Customer customer, int cost, List<Items> items,
				String pickupAddress, String deliveryAddress, int otp, DeliveryPartner delpat, Payment pay,
				int estimatetime, double distance, int discount, int coupones, String specialrequest,
				String deliveryinstuction, int date) {
			super();
			this.id = id;
			this.status = status;
			this.restaurant = restaurant;
			this.customer = customer;
			this.cost = cost;
			this.items = items;
			this.pickupAddress = pickupAddress;
			this.deliveryAddress = deliveryAddress;
			this.otp = otp;
			this.delpat = delpat;
			this.pay = pay;
			this.estimatetime = estimatetime;
			this.distance = distance;
			this.discount = discount;
			this.coupones = coupones;
			this.specialrequest = specialrequest;
			this.deliveryinstuction = deliveryinstuction;
			this.date = date;
		}
		public Orders() {
			super();
		}
		@Override
		public String toString() {
			return "Orders [id=" + id + ", status=" + status + ", restaurant=" + restaurant + ", customer=" + customer
					+ ", cost=" + cost + ", items=" + items + ", pickupAddress=" + pickupAddress + ", deliveryAddress="
					+ deliveryAddress + ", otp=" + otp + ", delpat=" + delpat + ", pay=" + pay + ", estimatetime="
					+ estimatetime + ", distance=" + distance + ", discount=" + discount + ", coupones=" + coupones
					+ ", specialrequest=" + specialrequest + ", deliveryinstuction=" + deliveryinstuction + ", date="
					+ date + "]";
		}
	
	

	
	
	
	

}
