package com.qa.dfeswfinalproject.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RestaurantMenu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column (nullable = false)
	private String starter;
	
	@Column (nullable = false)
	private String sideDish;
	
	@Column (nullable = false)
	private String mainDish;
	
	@Column (nullable = false)
	private String dessert;
	
	@Column (nullable = false)
	private Float price;
	
	@Column (nullable = false)
	private String cuisine;
	
	public RestaurantMenu () {
	

	}
	
	
	
	

	public RestaurantMenu(String starter, String sideDish, String mainDish, String dessert, Float price,
			String cuisine) {
		super();
		this.starter = starter;
		this.sideDish = sideDish;
		this.mainDish = mainDish;
		this.dessert = dessert;
		this.price = price;
		this.cuisine = cuisine;
	}





	public RestaurantMenu(long id, String starter, String sideDish, String mainDish, String dessert, Float price,String cuisine) {
		super();

		this.starter = starter;
		this.sideDish =starter;
		this.mainDish =mainDish;
		this.price = price;
		this.cuisine =cuisine;

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
	
	@Override
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
		return false;
		if (getClass() != obj.getClass())
			return false;
		
		
		RestaurantMenu other = (RestaurantMenu) obj;
		return Objects.equals(starter,other.starter )&&Objects.equals(sideDish,other.sideDish)&&Objects.equals(mainDish,other.mainDish)
			&&Objects.equals(cuisine, other.cuisine)&&Objects.equals(dessert,other.dessert)&&Objects.equals(price, other.price)	&&id==other.id;
	}
	
}


