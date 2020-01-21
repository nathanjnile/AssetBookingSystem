package com.NathanNile.AssetTracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.NathanNile.AssetTracker.entity.Asset;
import com.NathanNile.AssetTracker.entity.Booking;
import com.NathanNile.AssetTracker.entity.BookingDTO;
import com.NathanNile.AssetTracker.service.AssetService;
import com.NathanNile.AssetTracker.service.BookingService;

@Controller
@RequestMapping("/assets")
public class AssetController {
	
	private AssetService assetService;
	
	@Autowired
	public AssetController(AssetService theAssetService) {
		assetService = theAssetService;
	}
	
	@GetMapping("/list")
	public String showList(Model theModel) {
		
		List<Asset> theAssets = assetService.findAll();
		
		//List<Asset> theAssets = assetService.findAllByAssetName("Wrench");
		
		theModel.addAttribute("assets", theAssets);
		
		return "assets/list-assets-test";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Asset theAsset = new Asset();
		
		Booking theBooking = new Booking();
		
		theModel.addAttribute("booking", theBooking);
		
		return "assets/asset-form";
		
	}
	
}
