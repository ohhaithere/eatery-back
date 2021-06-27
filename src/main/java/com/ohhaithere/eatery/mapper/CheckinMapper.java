package com.ohhaithere.eatery.mapper;

import com.ohhaithere.eatery.dto.CheckinDto;
import com.ohhaithere.eatery.model.Checkin;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CheckinMapper {

    CheckinDto toDto(Checkin checkin);
    Checkin toEntity(CheckinDto checkinDto);

}
