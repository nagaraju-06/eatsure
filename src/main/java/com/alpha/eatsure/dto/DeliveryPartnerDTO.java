package com.alpha.eatsure.dto;

public class DeliveryPartnerDTO {
	private String name;
	private long mobno;
	private String  mail;
	private String VechileNo;
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
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getVechileNo() {
		return VechileNo;
	}
	public void setVechileNo(String vechileNo) {
		VechileNo = vechileNo;
	}
	public DeliveryPartnerDTO(String name, long mobno, String mail, String vechileNo) {
		super();
		this.name = name;
		this.mobno = mobno;
		this.mail = mail;
		VechileNo = vechileNo;
	}
	public DeliveryPartnerDTO() {
		super();
	}

}
