package com.NathanNile.AssetTracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.NathanNile.AssetTracker.entity.Asset;
import com.NathanNile.AssetTracker.entity.Booking;
import com.NathanNile.AssetTracker.service.AssetService;
import com.NathanNile.AssetTracker.service.BookingService;

@Controller
@RequestMapping("/bookings")
public class BookingController {
	
	private BookingService bookingService;
	
	@Autowired
	public BookingController(BookingService theBookingService) {
		bookingService = theBookingService;
	}
	
	
	@GetMapping("/list")
	public String showBookingsList(Model theModel) {
		
		List<Booking> theBookings = bookingService.findAll();
		
		theModel.addAttribute("bookings", theBookings);
		
		return "bookings/list-bookings";
	}
	
}
