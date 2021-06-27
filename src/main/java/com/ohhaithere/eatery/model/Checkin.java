package com.ohhaithere.eatery.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
public class Checkin {

    @Id
    private UUID id;
    private UUID userId;
    private UUID dishId;

}
