package com.ohhaithere.eatery.dto;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Builder
@Data
public class DishDto {

    UUID id;
    String name;
    Double price;

}
