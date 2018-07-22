package com.example.ecsitedeveloplearning.ec.shop.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name = "products")
public class Product {
	//test
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	
	@Column(name = "name")
	public String name;

	@Column(name = "category_id")
	public String categoryId;
	
	@Column(name = "price")
	public Integer price;
	
	@Column(name = "description")
	public String description;
	
	@Column(name = "image_path")
	public String imagePath;
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created", nullable = false)
	public Date created;
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated", nullable = true)
	public Date updated;

}