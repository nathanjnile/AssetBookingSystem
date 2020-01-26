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
import com.NathanNile.AssetTracker.service.AssetService;
import com.NathanNile.AssetTracker.service.BookingService;

@Controller
@RequestMapping("/assets")
public class AssetController {
	
	@Autowired
	private BookingService bookingService;
	
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
	
	@GetMapping("/list/bristol")
	public String showListBristol(Model theModel) {
		
		String location = "Bristol";
		
		List<Asset> theAssets = assetService.findAllByHomeLocation(location);
		
		theModel.addAttribute("assets", theAssets);
		
		return "assets/list-assets";
	}
	
	@GetMapping("/list/bath")
	public String showListBath(Model theModel) {
		
		String location = "Bath";
		
		List<Asset> theAssets = assetService.findAllByHomeLocation(location);
		
		theModel.addAttribute("assets", theAssets);
		
		return "assets/list-assets";
	}
	
	@GetMapping("/list/portishead")
	public String showListPortishead(Model theModel) {
		
		String location = "Portishead";
		
		List<Asset> theAssets = assetService.findAllByHomeLocation(location);
		
		theModel.addAttribute("assets", theAssets);
		
		return "assets/list-assets";
	}
	
	
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Asset theAsset = new Asset();
		
//		Booking theBooking = new Booking();
//		
//		theModel.addAttribute("booking", theBooking);
		
		theModel.addAttribute("asset", theAsset);
		
		return "assets/asset-form";
		
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("assetId") int theId, Model theModel) {
		
		// get the employee from the service
		Asset theAsset = assetService.findById(theId);
		
		// set employee as a model attribute to pre-populate the form
		theModel.addAttribute("asset", theAsset);
				
		// send over to our form
		
		return "assets/asset-form";
	}
	
	@GetMapping("/showFormForBooking")
	public String showFormForBooking(@RequestParam("assetId") int theId, Model theModel) {
		
		// get the employee from the service
		//Asset theAsset = assetService.findById(theId);
		Booking theBooking = new Booking(theId);
		
		// set employee as a model attribute to pre-populate the form
		theModel.addAttribute("booking", theBooking);
		
		Asset theAsset = assetService.findById(theId);
		
		theModel.addAttribute("asset", theAsset);
				
		// send over to our form
		
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
		
		// Delete employee
		assetService.deleteById(theId);
		
		return "redirect:/assets/list";
	}
	
	@PostMapping("/saveBooking")
	public String saveBooking(@ModelAttribute("booking") Booking theBooking) {
		
		// save the employee
		bookingService.save(theBooking);
		
		
		// use a redirect to prevent duplicate submissions
		return "redirect:/assets/list";
	}
	
	
}
