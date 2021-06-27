package com.ohhaithere.eatery.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Builder
public class RestaurantDto {

    UUID id;
    String name;
    List<DishDto> dishes;

}
