package com.NathanNile.AssetTracker.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.NathanNile.AssetTracker.service.AssetService;

@Controller
@RequestMapping("/")
public class HomeController {
	
	private AssetService assetService;
	
	@Autowired
	public HomeController(AssetService theAssetService) {
		assetService = theAssetService;
	}
	
//	@GetMapping("/home")
//	public String showHome(Model theModel) {
//		
//		List<String> homeLocationx = new ArrayList<>();
//		
//		homeLocationx = assetService.findDistinctHomeLocation();
//		
//		theModel.addAttribute("locations", homeLocationx);
//		
//		return "home/home-page";
//	}
}
