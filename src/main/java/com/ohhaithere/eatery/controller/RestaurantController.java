package com.ohhaithere.eatery.controller;

import com.ohhaithere.eatery.dto.DishDto;
import com.ohhaithere.eatery.dto.RestaurantDto;
import com.ohhaithere.eatery.service.DishService;
import com.ohhaithere.eatery.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/restaurant")
@RequiredArgsConstructor
public class RestaurantController {

    private final RestaurantService restaurantService;
    private final DishService dishService;

    @PostMapping
    ResponseEntity<RestaurantDto> createRestaurant(@RequestBody RestaurantDto restaurantDto) {
        return ResponseEntity.ok(restaurantService.createRestaurant(restaurantDto));
    }

    @PostMapping("/{restaurantId}/dish")
    public ResponseEntity<DishDto> createDish(@RequestBody DishDto dishDto, @PathVariable UUID restaurantId) {
        return ResponseEntity.ok(dishService.createDish(dishDto, restaurantId));
    }

    @GetMapping("/{restaurantId}/dish")
    public ResponseEntity<List<DishDto>> getDishes(@PathVariable UUID restaurantId) {
        return ResponseEntity.ok(dishService.getDishes(restaurantId));
    }

    @GetMapping
    ResponseEntity<List<RestaurantDto>> getRestaurants() {
        return ResponseEntity.ok(restaurantService.getRestaurants());
    }

    @PutMapping
    ResponseEntity<RestaurantDto> updateRestaurant(@RequestBody RestaurantDto restaurantDto) {
        return ResponseEntity.ok(restaurantService.updateRestaurant(restaurantDto));
    }
}
