package com.ohhaithere.eatery.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@Entity
public class User {

    @Id
    UUID id;
    String login;
    String password;
    String name;
    List<Dish> dishes;


}
