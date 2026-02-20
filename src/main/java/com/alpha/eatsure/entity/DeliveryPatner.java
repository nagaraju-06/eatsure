package com.alpha.eatsure.entity;

import jakarta.persistence.*;

@Entity
public class DeliveryPatner {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String name;
	private String mobno;
	private String vehicleType;

	public DeliveryPatner() {
	}

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

	public String getMobno() {
		return mobno;
	}

	public void setMobno(String mobno) {
		this.mobno = mobno;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public DeliveryPatner(int id, String name, String mobno, String vehicleType) {
		super();
		this.id = id;
		this.name = name;
		this.mobno = mobno;
		this.vehicleType = vehicleType;
	}
	
	
}
