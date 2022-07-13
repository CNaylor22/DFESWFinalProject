package com.qa.dfeswfinalproject.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class RestaurantMenu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String starter;
	private String sideDish;
	private String mainDish;
	private String dessert;
	private Float price;
	private String cuisine;

	public RestaurantMenu(long id, String starter, String sideDish, String mainDish, String dessert, Float price,String cuisine) {
		super();

		this.setStarter(starter);
		this.setSideDish(starter);
		this.setMainDish(mainDish);
		this.setPrice(price);
		this.setCuisine(cuisine);

	}

	public long getId() {
		return id;
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

	public String getStarter() {
		return starter;
	}

	public void setStarter(String starter) {
		this.starter = starter;
	}

	public String getMainDish() {
		return mainDish;
	}

	public void setMainDish(String mainDish) {
		this.mainDish = mainDish;
	}

	public String getSideDish() {
		return sideDish;
	}

	public void setSideDish(String sideDish) {
		this.sideDish = sideDish;
	}

	public String getDessert() {
		return dessert;
	}

	public void setDessert(String dessert) {
		this.dessert = dessert;
	}
}
