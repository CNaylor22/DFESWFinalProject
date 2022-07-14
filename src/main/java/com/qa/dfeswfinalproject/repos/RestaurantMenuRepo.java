package com.qa.dfeswfinalproject.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.qa.dfeswfinalproject.entities.RestaurantMenu;

@Repository

public interface RestaurantMenuRepo extends JpaRepository<RestaurantMenu, Long> {

}
