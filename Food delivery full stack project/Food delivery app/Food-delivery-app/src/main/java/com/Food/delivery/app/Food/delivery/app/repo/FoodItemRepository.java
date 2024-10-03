package com.Food.delivery.app.Food.delivery.app.repo;


import com.Food.delivery.app.Food.delivery.app.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodItemRepository extends JpaRepository<FoodItem, Long> {

}


