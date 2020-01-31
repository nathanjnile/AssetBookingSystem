package com.NathanNile.AssetTracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.NathanNile.AssetTracker.entity.Asset;
import com.NathanNile.AssetTracker.entity.Booking;
import com.NathanNile.AssetTracker.mail.EmailService;
import com.NathanNile.AssetTracker.service.AssetService;
import com.NathanNile.AssetTracker.service.BookingService;

@Controller
@RequestMapping("/assets")
public class AssetController {
	
	@Autowired
	private BookingService bookingService;
	
	@Autowired
	private EmailService emailService;
	
	private AssetService assetService;
	
	@Autowired
	public AssetController(AssetService theAssetService) {
		assetService = theAssetService;
	}
	
	@GetMapping("/list")
	public String showList(Model theModel) {
		
		List<Asset> theAssets = assetService.findAll();
		
		theModel.addAttribute("assets", theAssets);
		
		return "assets/list-assets";
	}
	
	@GetMapping("/list/handtools")
	public String showListHandTools(Model theModel) {
		
		String typeTools = "Hand Tools";
		
		List<Asset> theAssets = assetService.findAllByAssetType(typeTools);
		
		theModel.addAttribute("assets", theAssets);
		
		return "assets/list-assets";
	}
	
	@GetMapping("/list/powertools")
	public String showListPowerTools(Model theModel) {
		
		String typeTools = "Power Tools";
		
		List<Asset> theAssets = assetService.findAllByAssetType(typeTools);
		
		theModel.addAttribute("assets", theAssets);
		
		return "assets/list-assets";
	}
	
	@GetMapping("/list/machinetools")
	public String showListMachineTools(Model theModel) {
		
		String typeTools = "Machine Tools";
		
		List<Asset> theAssets = assetService.findAllByAssetType(typeTools);
		
		theModel.addAttribute("assets", theAssets);
		
		return "assets/list-assets";
	}
	
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		Asset theAsset = new Asset();
			
		theModel.addAttribute("asset", theAsset);
		
		return "assets/asset-form";
		
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("assetId") int theId, Model theModel) {
		
		Asset theAsset = assetService.findById(theId);
		
		theModel.addAttribute("asset", theAsset);
		
		return "assets/asset-form";
	}
	
	@GetMapping("/showFormForBooking")
	public String showFormForBooking(@RequestParam("assetId") int theId, Model theModel) {
		
		Booking theBooking = new Booking(theId);
		
		theModel.addAttribute("booking", theBooking);
		
		Asset theAsset = assetService.findById(theId);
		
		theModel.addAttribute("asset", theAsset);
		
		List<Booking> theBookings = bookingService.findByAssetIdOrderByStartOfBookingAsc(theId);
		
		theModel.addAttribute("bookingslist", theBookings);
				
		return "assets/booking-form";
	}
	
	
	@PostMapping("/save")
	public String saveAsset(@ModelAttribute("asset") Asset theAsset) {
		
		// save the employee
		assetService.save(theAsset);
		
		// use a redirect to prevent duplicate submissions
		return "redirect:/assets/list";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("assetId") int theId) {
		
		assetService.deleteById(theId);
		
		return "redirect:/assets/list";
	}
	
	
	@PostMapping("/saveBooking")
	public String saveBooking(@ModelAttribute("booking") Booking theBooking) {
		
		bookingService.save(theBooking);
		
		String assetName = assetService.findById(theBooking.getAssetId()).getAssetName();
		
		emailService.sendMail(theBooking.getBookerEmail(), "New Booking", "Hello " + theBooking.getBookerFirstName() + " " + 
				theBooking.getBookerLastName() + " you have booked a " + assetName + " from " + theBooking.getStartOfBooking() + 
				" to " + theBooking.getEndOfBooking());
		
		
		return "redirect:/assets/list";
	}
	
	@GetMapping("/deletebooking")
	public String deleteBooking(@RequestParam("bookingId") int theBookingId, @RequestParam("assetId") int theAssetId, Model theModel) {
		
		if (bookingService.findById(theBookingId) == null) {
			return showFormForBooking(theAssetId, theModel);
		}
		
		bookingService.deleteById(theBookingId);
		
		return showFormForBooking(theAssetId, theModel);
	}
	
}
