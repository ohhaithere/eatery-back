package com.ohhaithere.eatery.controller;

import com.ohhaithere.eatery.dto.CheckinDto;
import com.ohhaithere.eatery.service.CheckinService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/checkin")
@RequiredArgsConstructor
public class CheckinController {

    private CheckinService checkinService;

    @PostMapping
    public CheckinDto checkin(CheckinDto checkinDto) {
        return checkinService.checkin(checkinDto);
    }

}
