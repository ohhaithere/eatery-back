package com.ohhaithere.eatery.service;

import com.ohhaithere.eatery.dto.RestaurantDto;
import com.ohhaithere.eatery.mapper.RestaurantMapper;
import com.ohhaithere.eatery.model.Restaurant;
import com.ohhaithere.eatery.repository.RestaurantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class RestaurantService {

    RestaurantMapper restaurantMapper;
    RestaurantRepository restaurantRepository;

    public RestaurantDto createRestaurant(RestaurantDto restaurantDto) {
        Restaurant restaurant = restaurantMapper.toEntity(restaurantDto);
        restaurant.setId(UUID.randomUUID());
        restaurantRepository.save(restaurant);
        return  restaurantMapper.toDto(restaurant);
    }

    public RestaurantDto updateRestaurant(RestaurantDto restaurantDto) {
        Restaurant restaurant = restaurantMapper.toEntity(restaurantDto);
        restaurantRepository.save(restaurant);
        return  restaurantMapper.toDto(restaurant);
    }

    public List<RestaurantDto> getRestaurants() {
        List<RestaurantDto> restaurantDtos = restaurantRepository
                .findAll()
                .stream()
                .map(skill -> restaurantMapper.toDto(skill))
                .collect(Collectors.toList());
        return restaurantDtos;
    }

}
