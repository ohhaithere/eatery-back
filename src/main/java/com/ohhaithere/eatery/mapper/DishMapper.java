package com.ohhaithere.eatery.mapper;

import com.ohhaithere.eatery.dto.DishDto;
import com.ohhaithere.eatery.model.Dish;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {
        RestaurantMapper.class
})
public interface DishMapper {

    DishDto toDto(Dish dish);
    Dish toEntity(DishDto dishDto);

}
