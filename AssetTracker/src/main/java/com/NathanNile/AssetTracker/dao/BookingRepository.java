package com.NathanNile.AssetTracker.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.NathanNile.AssetTracker.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer> {
	
	
	// add method to sort by last name
	
	// public List<Asset> findAllByOrderByLastNameAsc();
}
