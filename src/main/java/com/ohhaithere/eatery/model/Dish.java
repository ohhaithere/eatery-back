package com.ohhaithere.eatery.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
public class Dish {

    @Id
    UUID id;
    String name;
    @ManyToOne
    Restaurant restaurant;

}
