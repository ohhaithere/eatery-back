package com.ohhaithere.eatery.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@Entity
public class Restaurant {

    @Id
    UUID id;
    String name;
    @OneToMany(mappedBy="restaurant")
    List<Dish> dishes;

}
