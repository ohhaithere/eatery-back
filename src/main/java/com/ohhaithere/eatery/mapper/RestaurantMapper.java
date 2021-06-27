package com.ohhaithere.eatery.mapper;

import com.ohhaithere.eatery.dto.RestaurantDto;
import com.ohhaithere.eatery.model.Restaurant;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {
        DishMapper.class
})
public interface RestaurantMapper {

    RestaurantDto toDto(Restaurant restaurant);
    Restaurant toEntity(RestaurantDto restaurantDto);

}
