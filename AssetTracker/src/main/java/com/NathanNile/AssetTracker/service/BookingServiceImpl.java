package com.NathanNile.AssetTracker.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NathanNile.AssetTracker.dao.AssetRepository;
import com.NathanNile.AssetTracker.dao.BookingRepository;
import com.NathanNile.AssetTracker.entity.Asset;
import com.NathanNile.AssetTracker.entity.Booking;

@Service
public class BookingServiceImpl implements BookingService {

	private BookingRepository bookingRepository;
	
	@Autowired
	public BookingServiceImpl(BookingRepository theBookingRepository) {
		bookingRepository = theBookingRepository;
	}
	
	@Override
	public List<Booking> findAll() {
		return bookingRepository.findAll();
	}

	@Override
	public Booking findById(int theId) {
		
		Optional<Booking> result = bookingRepository.findById(theId);
		
		Booking theBooking = null;
		
		if (result.isPresent()) {
			theBooking = result.get();
		}
		else {
			throw new RuntimeException("Did not find asset id - " + theId);
		}
		
		return theBooking;
	}

	@Override
	public void save(Booking theBooking) {
		bookingRepository.save(theBooking);
		
	}

	@Override
	public void deleteById(int theId) {
		bookingRepository.deleteById(theId);
		
	}

}
