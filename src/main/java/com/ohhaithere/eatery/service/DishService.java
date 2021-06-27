package com.ohhaithere.eatery.service;

import com.ohhaithere.eatery.dto.DishDto;
import com.ohhaithere.eatery.mapper.DishMapper;
import com.ohhaithere.eatery.model.Dish;
import com.ohhaithere.eatery.model.Restaurant;
import com.ohhaithere.eatery.repository.DishRepository;
import com.ohhaithere.eatery.repository.RestaurantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class DishService {

    private DishMapper dishMapper;
    private DishRepository dishRepository;
    private RestaurantRepository restaurantRepository;

    public DishDto createDish(DishDto dishDto, UUID restaurantId) {
        Dish dish = dishMapper.toEntity(dishDto);
        Restaurant restaurant = restaurantRepository.getOne(restaurantId);
        dish.setId(UUID.randomUUID());
        dish.setRestaurant(restaurant);
        dishRepository.save(dish);
        return dishDto;
    }

    public List<DishDto> getDishes(UUID restaurantId) {
        Restaurant restaurant = restaurantRepository.getOne(restaurantId);
        return restaurant
                .getDishes()
                .stream()
                .map(dish -> dishMapper.toDto(dish))
                .collect(Collectors.toList());
    }

}
