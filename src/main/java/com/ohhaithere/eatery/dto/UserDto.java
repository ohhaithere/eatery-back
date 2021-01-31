package com.ohhaithere.eatery.dto;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Builder
@Data
public class UserDto {

    UUID id;
    String login;
    String password;
    String name;

}
