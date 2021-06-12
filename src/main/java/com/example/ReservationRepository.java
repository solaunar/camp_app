package com.example;

import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.Optional;

public interface ReservationRepository extends CrudRepository<Reservation,Integer> {
    Optional<Reservation> findByUserIdAndCampIdAndRdateAndDdate(int userId, String campId, Date rdate, Date ddate);
}
