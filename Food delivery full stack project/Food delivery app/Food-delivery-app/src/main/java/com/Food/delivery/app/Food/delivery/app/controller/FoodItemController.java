package com.Food.delivery.app.Food.delivery.app.controller;




import com.Food.delivery.app.Food.delivery.app.model.FoodItem;
import com.Food.delivery.app.Food.delivery.app.repo.FoodItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fooditems")
public class FoodItemController {

    @Autowired
    private FoodItemRepository foodItemRepository;

    @GetMapping
    public List<FoodItem> getAllFoodItems() {
        return foodItemRepository.findAll();
    }

    @PostMapping
    public FoodItem createFoodItem(@RequestBody FoodItem foodItem) {
        return foodItemRepository.save(foodItem);
    }

    @PutMapping("/{id}")
    public FoodItem updateFoodItem(@PathVariable Long id, @RequestBody FoodItem updatedItem) {
        FoodItem foodItem = foodItemRepository.findById(id).orElseThrow();
        foodItem.setName(updatedItem.getName());
        foodItem.setDescription(updatedItem.getDescription());
        foodItem.setPrice(updatedItem.getPrice());
        foodItem.setDilvery_Address(updatedItem.getDilvery_Address());
        foodItem.setPhone(updatedItem.getPhone());
        return foodItemRepository.save(foodItem);
    }

    @DeleteMapping("/{id}")
    public void deleteFoodItem(@PathVariable Long id) {
        foodItemRepository.deleteById(id);
    }
}


