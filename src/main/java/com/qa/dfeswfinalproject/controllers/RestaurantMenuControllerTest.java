package com.qa.dfeswfinalproject.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.dfeswfinalproject.entities.RestaurantMenu;





@SpringBootTest
@AutoConfigureMockMvc
@Sql(scripts = {"classpath;testschema.sql", "classpath:testdata.sql"}, executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
@ActiveProfiles("test")

public class RestaurantMenuControllerTest {

}
	
	
	@Autowired
	private MockMvc mvc;
	
	@Autowired
	private ObjectMapper mapper;
	
	@Test
	
	public void createTest() throws Exception {
		RestaurantMenu entry = new RestaurantMenu("Olives", "Salad", "Risotto", "Tiramisu", 14.99 , "Italian");
		String entryAsJSON = mapper.writeValueAsString(entry);
	
	
		RestaurantMenu result = new RestaurantMenu(2L,"Olives", "Salad", "Risotto", "Tiramisu", 14.99 , "Italian");
		String resultAsJSON= mapper.writeValueAsString(result);
	
		mvc.perform(post("/restaurantMenu/create")
			.contentType(MediaType.APPLICATION_JSON)
			.content(entryAsJSON))
			.andExpect(content().json(resultAsJSON));
	
	}
	
	
	@Test

	public void readAllTest() throws Exception {
		List<RestaurantMenu> output = new ArrayList<>();
		RestaurantMenu entry = new RestaurantMenu(1L,"Olives", "Salad", "Risotto", "Tiramisu", 14.99 , "Italian");
		output.add(entry);
		
		String outputAsJSON = mapper.writeValueAsString(output);
		
		mvc.perform(get("/restaurantMenu/readAll")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(content().json(outputAsJSON));
		
		
	}
		
		
	@Test
		
	public void readAllTest() throws Exception { 	
		List<RestaurantMenu> output = newArrayList<>();
		RestaurantMenu entry = new RestaurantMenu(2L,"Olives", "Salad", "Risotto", "Tiramisu", 14.99 , "Italian");
		output.add(entry);
		
		String outputAsJSON = mapper.writeValueAsString(output);
	
		
		mvc.perform(get("/restaurantMenu/readAll")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(content().json(outputAsJSON));
	
	}
	
	
	@Test
	public void readByIdTest() throws Exception {
		RestaurantMenu entry = new RestaurantMenu(2L,"Olives", "Salad", "Risotto", "Tiramisu", 14.99 , "Italian");
		String entryAsJSON = this.mapper.writeValueAsString(entry);
	
	
		mvc.perform(get("/restaurantMenu/readById/1")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(content().json(entryAsJSON));
	}
		
	@Test
	public void updateTest() throws Exception {	
		RestaurantMenu entry = new RestaurantMenu("Olives", "Salad", "Risotto", "Tiramisu", 14.99 , "Italian");
		RestaurantMenu result = new RestaurantMenu(2L,"Olives", "Salad", "Risotto", "Tiramisu", 14.99 , "Italian");
		String entryAsJSON = this.mapper.writeValueAsString(entry);
		String resultsAsJSON = this.mapper.writeValueAsString(result);	
		
		mvc.perform(put("/restaurantMenu/update/1")
		.contentType(MediaType.APPLICATION_JSON)
		.content(entryAsJSON))		
		.andExpect(content().json(resultAsJSON));
		
		
	}
		
		@Test
		public void deleteTest() throws Exception {
			mvc.perform(delete("/restaurantMenu/delete/1")
			.contentType(MediaType.APPLICATION_JSON))	
			.andExpect(content().string("true"));
		
		
		}
		
		
		
		
		
		
		
		
		
	
	
	
