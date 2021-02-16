package com.octaspring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Category")
public class Category {

	@Id
	private Long id;
	
	@Column(name="name")
	private String name;
	@Column(name="description")
	private String description;
	@Column(name="image")
	private String image;
	@Column(name="status")
	private int status;
	
	
	
	public Category(Long id, String name, String description, String image, int status) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.image = image;
		this.status = status;
	}



	public Category() {
		super();
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	
		
}
