package com.NathanNile.AssetTracker.service;

import java.util.List;

import com.NathanNile.AssetTracker.entity.Asset;
import com.NathanNile.AssetTracker.entity.BookingDTO;

public interface AssetService {
	
	public List<Asset> findAll();
	
//	public List<BookingDTO> fetchBookingDTOInnerJoin();
	
	List<Asset> findByBookingsAssetId(int assetId);
	
	public List<Asset> findAllByAssetName(String assetName);
	
	public Asset findById(int theId);
	
	public void save(Asset theAsset);
	
	public void deleteById(int theId);
}
