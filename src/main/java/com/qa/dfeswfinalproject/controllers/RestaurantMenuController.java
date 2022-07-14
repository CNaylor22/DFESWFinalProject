package com.qa.dfeswfinalproject.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.qa.dfeswfinalproject.entities.RestaurantMenu;
import com.qa.dfeswfinalproject.services.RestaurantMenuService;

@RestController
@RequestMapping("/restaurantMenu")

public class RestaurantMenuController {

	private RestaurantMenuService service;

	public RestaurantMenuController(RestaurantMenuService service) {
		this.service = service;
	}

	@PostMapping("/create")
	public RestaurantMenu create(@RequestBody RestaurantMenu restaurantMenu) {
		return this.service.create(restaurantMenu);

	}

	@GetMapping("readById/{id}")
	public RestaurantMenu readById(@PathVariable long id) {
		return this.service.readById(id);

	}

	@GetMapping("/readAll")
	public List<RestaurantMenu> readAll() {
		return this.service.readAll();

	}

	@PutMapping("/update/{id}")
	public RestaurantMenu update(@PathVariable Long id, @RequestBody RestaurantMenu restaurantMenu) {
		return this.service.update(id, restaurantMenu);

	}

	@DeleteMapping("/delete/{id}")
	public RestaurantMenu delete(@PathVariable Long id) {
		return this.delete(id);
	}

}
