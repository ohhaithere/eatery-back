package com.ohhaithere.eatery.repository;

import com.ohhaithere.eatery.model.Checkin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CheckinRepository extends JpaRepository<Checkin, UUID> {
}
