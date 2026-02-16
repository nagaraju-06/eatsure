package com.alpha.eatsure.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Payment {
	@Id
private int id;
	private long amount;
	private String type;
	private String status;
	 @OneToOne
	    @JoinColumn(name = "order_id")
	private Orders orders;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Orders getOrders() {
		return orders;
	}
	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	public Payment(int id, long amount, String type, String status, Orders orders) {
		super();
		this.id = id;
		this.amount = amount;
		this.type = type;
		this.status = status;
		this.orders = orders;
	}
	public Payment() {
		super();
	}
	@Override
	public String toString() {
		return "Payment [id=" + id + ", amount=" + amount + ", type=" + type + ", status=" + status + ", orders="
				+ orders + "]";
	}
	

}
