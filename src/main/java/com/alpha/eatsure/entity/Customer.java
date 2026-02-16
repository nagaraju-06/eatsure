package com.alpha.eatsure.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Customer {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private int id;

	    private String name;
	    private long mobno;
	    private String gender;

	    @Column(unique = true)
	    private String mail;

	    // Customer → Multiple Addresses (Unidirectional)
	    @OneToMany(cascade = CascadeType.ALL)
	    @JoinColumn(name = "customer_id")
	    private List<Address> address;

	    // Customer → Orders
	    @OneToMany(cascade = CascadeType.ALL)
	    @JoinColumn(name = "customer_id")
	    private List<Orders> orders;

	    // Customer → Items (if cart/favorites)
	    @OneToMany(cascade = CascadeType.ALL)
	    @JoinColumn(name = "customer_id")
	    private List<Items> items;

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

		public long getMobno() {
			return mobno;
		}

		public void setMobno(long mobno) {
			this.mobno = mobno;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getMail() {
			return mail;
		}

		public void setMail(String mail) {
			this.mail = mail;
		}

		public List<Address> getAddress() {
			return address;
		}

		public void setAddress(List<Address> address) {
			this.address = address;
		}

		public List<Orders> getOrders() {
			return orders;
		}

		public void setOrders(List<Orders> orders) {
			this.orders = orders;
		}

		public List<Items> getItems() {
			return items;
		}

		public void setItems(List<Items> items) {
			this.items = items;
		}

		public Customer(int id, String name, long mobno, String gender, String mail, List<Address> address,
				List<Orders> orders, List<Items> items) {
			super();
			this.id = id;
			this.name = name;
			this.mobno = mobno;
			this.gender = gender;
			this.mail = mail;
			this.address = address;
			this.orders = orders;
			this.items = items;
		}

		public Customer() {
			super();
		}

		@Override
		public String toString() {
			return "Customer [id=" + id + ", name=" + name + ", mobno=" + mobno + ", gender=" + gender + ", mail="
					+ mail + ", address=" + address + ", orders=" + orders + ", items=" + items + "]";
		}

	

}
