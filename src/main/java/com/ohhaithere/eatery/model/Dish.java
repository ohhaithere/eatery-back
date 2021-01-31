package com.ohhaithere.eatery.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import java.util.UUID;

@Data
@Builder
@Entity
public class Dish {

    @Id
    UUID id;
    String name;
    @JoinColumn(name="id")
    Restaurant restaurant;

}
