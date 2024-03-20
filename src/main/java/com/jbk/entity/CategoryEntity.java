package com.jbk.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "category")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryEntity {
	
	@Id
	@Column(unique = true,nullable = false)
	private long categoryId;
	
	@Column(unique = true,nullable = false)
	private String categoryName;
	
	@Column(unique = true,nullable = false)
	private String discription;
	
	@Column(nullable = false)
	private int discount;
	
	@Column(nullable = false)
	private int gst;
	
	@Column(nullable = false)
	private float deliveryCharge;
	
}
