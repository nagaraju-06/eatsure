package com.alpha.eatsure.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Payment {
	@Id
	private int estimatetime;
	private double distance;
	private int discount;
	private int coupones;
	private  String specialrequest;
	private String deliveryinstuction;
	private int date;
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
	public Payment(int estimatetime, double distance, int discount, int coupones, String specialrequest,
			String deliveryinstuction, int date) {
		super();
		this.estimatetime = estimatetime;
		this.distance = distance;
		this.discount = discount;
		this.coupones = coupones;
		this.specialrequest = specialrequest;
		this.deliveryinstuction = deliveryinstuction;
		this.date = date;
	}
	public Payment() {
		super();
	}
	@Override
	public String toString() {
		return "Payment [estimatetime=" + estimatetime + ", distance=" + distance + ", discount=" + discount
				+ ", coupones=" + coupones + ", specialrequest=" + specialrequest + ", deliveryinstuction="
				+ deliveryinstuction + ", date=" + date + "]";
	}
	
	

}
