package com.octaspring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Category")
public class PurchaseCourse {

	
	@Id
	private Long id;
	
	@Column(name="purchase")
	private Long pruchase;
	
}
