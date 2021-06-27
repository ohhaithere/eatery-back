package com.ohhaithere.eatery.service;

import com.ohhaithere.eatery.dto.CheckinDto;
import com.ohhaithere.eatery.mapper.CheckinMapper;
import com.ohhaithere.eatery.model.Checkin;
import com.ohhaithere.eatery.repository.CheckinRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class CheckinService {

    private CheckinRepository checkinRepository;
    private CheckinMapper checkinMapper;

    public CheckinDto checkin(CheckinDto checkinDto) {
        Checkin checkin = checkinMapper.toEntity(checkinDto);
        checkin.setId(UUID.randomUUID());
        checkinRepository.save(checkin);
        return checkinMapper.toDto(checkin);
    }

}
