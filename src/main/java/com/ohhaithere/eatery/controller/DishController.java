package com.ohhaithere.eatery.controller;

import com.ohhaithere.eatery.dto.DishDto;
import com.ohhaithere.eatery.service.DishService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/dish")
@RequiredArgsConstructor
public class DishController {

    private final DishService dishService;

}
