package com.infosys.wecaree.Repository;

import com.infosys.wecaree.Entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Integer> {
}
