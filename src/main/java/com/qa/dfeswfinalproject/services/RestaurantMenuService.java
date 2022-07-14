package com.qa.dfeswfinalproject.services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.qa.dfeswfinalproject.entities.RestaurantMenu;
import com.qa.dfeswfinalproject.repos.RestaurantMenuRepo;

@Service
public class RestaurantMenuService {

	private RestaurantMenuRepo repo;

	public RestaurantMenuService(RestaurantMenuRepo repo) {
		this.repo = repo;

	}

	public RestaurantMenu create(RestaurantMenu restaurantMenu) {
		return this.repo(restaurantMenu);

	}

	private RestaurantMenu repo(RestaurantMenu restaurantMenu) {
		// TODO Auto-generated method stub
		return null;
	}

	public RestaurantMenu readById(long id) {
		return this.repo.findById(id).get();

	}

	public List<RestaurantMenu> readAll() {
		return this.repo.findAll();

	}

	public RestaurantMenu update(long id, RestaurantMenu restaurantMenu) {
		RestaurantMenu existing = this.repo.findById(id).get();

		existing.setStarter(restaurantMenu.getStarter());
		existing.setSideDish(restaurantMenu.getSideDish());
		existing.setMainDish(restaurantMenu.getMainDish());
		existing.setDessert(restaurantMenu.getDessert());
		existing.setCuisine(restaurantMenu.getCuisine());
		existing.setPrice(restaurantMenu.getPrice());

		return this.repo.saveAndFlush(existing);
	}

	public boolean delete(long id) {
		this.repo.deleteById(id);

		return !this.repo.existsById(id);
	}
}