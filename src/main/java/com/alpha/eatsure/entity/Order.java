package com.alpha.eatsure.entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "orders") // changed from "order" (reserved keyword)
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String status;

    // Many orders belong to one restaurant
    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;

    // One order belongs to one customer
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    private double cost;

    // One order has many items
    @OneToMany
    @JoinColumn(name = "order_id") 
    // This creates foreign key in Items table
    private List<Items> items;

    private String pickupAddress;
    private String deliveryAddress;

    @Column(unique = true)
    private String otp;

    @OneToOne
    @JoinColumn(name = "delivery_partner_id")
    private DeliveryPartner deliveryPartner;

    @OneToOne
    @JoinColumn(name = "payment_id")
    private Payment payment;

    private String estimatedTime;
    private double distance;
    private double discount;
    private String coupon;
    private String specialRequest;
    private String deliveryInstructions;
    private String date;

    // ================= CONSTRUCTORS =================

    public Order() {
    }

    public Order(String status, Restaurant restaurant, Customer customer, double cost,
                 List<Items> items, String pickupAddress, String deliveryAddress,
                 String otp, DeliveryPartner deliveryPartner, Payment payment,
                 String estimatedTime, double distance, double discount,
                 String coupon, String specialRequest,
                 String deliveryInstructions, String date) {

        this.status = status;
        this.restaurant = restaurant;
        this.customer = customer;
        this.cost = cost;
        this.items = items;
        this.pickupAddress = pickupAddress;
        this.deliveryAddress = deliveryAddress;
        this.otp = otp;
        this.deliveryPartner = deliveryPartner;
        this.payment = payment;
        this.estimatedTime = estimatedTime;
        this.distance = distance;
        this.discount = discount;
        this.coupon = coupon;
        this.specialRequest = specialRequest;
        this.deliveryInstructions = deliveryInstructions;
        this.date = date;
    }

    // ================= GETTERS & SETTERS =================

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

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
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

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    public DeliveryPartner getDeliveryPartner() {
        return deliveryPartner;
    }

    public void setDeliveryPartner(DeliveryPartner deliveryPartner) {
        this.deliveryPartner = deliveryPartner;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public String getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(String estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getCoupon() {
        return coupon;
    }

    public void setCoupon(String coupon) {
        this.coupon = coupon;
    }

    public String getSpecialRequest() {
        return specialRequest;
    }

    public void setSpecialRequest(String specialRequest) {
        this.specialRequest = specialRequest;
    }

    public String getDeliveryInstructions() {
        return deliveryInstructions;
    }

    public void setDeliveryInstructions(String deliveryInstructions) {
        this.deliveryInstructions = deliveryInstructions;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}