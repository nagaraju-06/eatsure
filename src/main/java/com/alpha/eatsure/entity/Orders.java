package com.alpha.eatsure.entity;

import java.util.List;

import com.alpha.eatsure.repository.DeliveryPatnerRepository;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import com.alpha.eatsure.entity.DeliveryPatner; 

@Entity
public class Orders {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int id;
	private String status;
	private String resturtant;
	private int cost;
	@OneToMany
	private List<Items>items;
	private String pickupAddress;
	private String delvieryaddress;
	private int otp;
	
	@Override
	public String toString() {
		return "Orders [id=" + id + ", status=" + status + ", resturtant=" + resturtant + ", cost=" + cost + ", items="
				+ items + ", pickupAddress=" + pickupAddress + ", delvieryaddress=" + delvieryaddress + ", otp=" + otp
				+ "]";
	}
	public Orders() {
		super();
	}
	public Orders(int id, String status, String resturtant, int cost, List<Items> items, String pickupAddress,
			String delvieryaddress, int otp, DeliveryPatner delpat) {
		super();
		this.id = id;
		this.status = status;
		this.resturtant = resturtant;
		this.cost = cost;
		this.items = items;
		this.pickupAddress = pickupAddress;
		this.delvieryaddress = delvieryaddress;
		this.otp = otp;
		
	}
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
	public String getResturtant() {
		return resturtant;
	}
	public void setResturtant(String resturtant) {
		this.resturtant = resturtant;
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
	public String getDelvieryaddress() {
		return delvieryaddress;
	}
	public void setDelvieryaddress(String delvieryaddress) {
		this.delvieryaddress = delvieryaddress;
	}
	public int getOtp() {
		return otp;
	}
	public void setOtp(int otp) {
		this.otp = otp;
	}
	
}
