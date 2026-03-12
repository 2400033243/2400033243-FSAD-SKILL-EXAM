package com.klef.fsad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klef.fsad.model.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Long> {

}