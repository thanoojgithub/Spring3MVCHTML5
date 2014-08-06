package com.html5one.vo;

import java.io.Serializable;

public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String bDay;
	private String email;
	private String gender;
	private String vehicle;
	private String bikeBrand;
	private String carBrand;
	private String note;

	public Customer() {
	}

	public Customer(String name, String bDay, String email, String gender,
			String vehicle, String bikeBrand, String carBrand, String note) {
		super();
		this.name = name;
		this.bDay = bDay;
		this.email = email;
		this.gender = gender;
		this.vehicle = vehicle;
		this.bikeBrand = bikeBrand;
		this.carBrand = carBrand;
		this.note = note;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getbDay() {
		return bDay;
	}

	public void setbDay(String bDay) {
		this.bDay = bDay;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getVehicle() {
		return vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	public String getBikeBrand() {
		return bikeBrand;
	}

	public void setBikeBrand(String bikeBrand) {
		this.bikeBrand = bikeBrand;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "Name : " + name + " || " + "bDay : " + bDay + " || "
				+ "email : " + email + " || " + "gender : " + gender + " || "
				+ "vehicle: " + vehicle + " || " + " bykeBrand : " + bikeBrand
				+ " || " + " carBrand : " + carBrand + " || " + "Note:  "
				+ note;
	}

}