package com.spring3mvchtml5.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMER", schema="mydb")
public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CID", unique = true, nullable = false)
	private Integer cId;
	
	@Column(name = "FIRSTNAME", unique = true, nullable = false)
	private String firstName;
	
	@Column(name = "LASTNAME", unique = true, nullable = false)
	private String LastName;
	
	@Column(name = "EMAIL", unique = true, nullable = false)
	private String email;

	public Customer() {
	}
	
	public Customer(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		LastName = lastName;
		this.email = email;
	}

	public Integer getcId() {
		return cId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", firstName=" + firstName
				+ ", LastName=" + LastName + ", email=" + email + "]";
	}

}