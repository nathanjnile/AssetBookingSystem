package com.NathanNile.AssetTracker.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.NathanNile.AssetTracker.entity.Asset;
import com.NathanNile.AssetTracker.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer> {
	
	
	List<Booking> findAllByOrderByStartOfBookingAsc();
	
}
