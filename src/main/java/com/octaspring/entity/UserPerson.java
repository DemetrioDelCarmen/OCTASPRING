package com.octaspring.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;

public class UserPerson {

	

	@Id
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private int password;
	
	@Column(name="registered")
	private java.util.Date reigstered;
	
	@Column(name="gender")
	private int gender;
	
	@Column(name="status")
	private int status;
		
	@Column(name="photo")
	private String photo;

	
	
	
	
	
	public UserPerson(String name, String lastname, String email, int password, Date reigstered, int gender, int status,
			String photo) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.reigstered = reigstered;
		this.gender = gender;
		this.status = status;
		this.photo = photo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public java.util.Date getReigstered() {
		return reigstered;
	}

	public void setReigstered(java.util.Date reigstered) {
		this.reigstered = reigstered;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
	
	
	
}
