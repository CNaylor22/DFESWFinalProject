package com.qa.dfeswfinalproject.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Restaurant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String dish;
	private Float price;
	private String cuisine;

	public Restaurant(long id, String dish, Float price, String cuisine) {
		super();
		this.setDish(dish);
		this.setPrice(price);
		this.setCuisine(cuisine);

	}
	public long getId() {
		return id;
	}
	
	
	
	
	public String getDish() {
		return dish;
	}

	public void setDish(String dish) {
		this.dish = dish;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
}
