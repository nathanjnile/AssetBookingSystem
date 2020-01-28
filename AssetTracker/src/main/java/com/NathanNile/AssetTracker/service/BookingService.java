package com.NathanNile.AssetTracker.service;

import java.util.List;

import com.NathanNile.AssetTracker.entity.Asset;
import com.NathanNile.AssetTracker.entity.Booking;

public interface BookingService {
	
	public List<Booking> findAll();
	
	public Booking findById(int theId);
	
	public void save(Booking theBooking);
	
	public void deleteById(int theId);
	
	public List<Booking> findAllByOrderByStartOfBookingAsc();
	
}
