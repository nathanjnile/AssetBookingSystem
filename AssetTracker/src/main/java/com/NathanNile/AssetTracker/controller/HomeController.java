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
@RequestMapping("/")
public class HomeController {
	
	private AssetService assetService;
	
	@Autowired
	public HomeController(AssetService theAssetService) {
		assetService = theAssetService;
	}
	
	@GetMapping("/home")
	public String showHome(Model theModel) {
		//
		List<Asset> theAssets = assetService.findAll();
		
		theModel.addAttribute("assets", theAssets);
		
		return "home/home-page";
	}
}
