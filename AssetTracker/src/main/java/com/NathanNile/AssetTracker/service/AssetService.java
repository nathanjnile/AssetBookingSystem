package com.NathanNile.AssetTracker.service;

import java.util.List;

import com.NathanNile.AssetTracker.entity.Asset;

public interface AssetService {
	
	public List<Asset> findAll();
	
//	public List<BookingDTO> fetchBookingDTOInnerJoin();
	
	List<Asset> findByBookingsAssetId(int assetId);
	
	public List<Asset> findAllByAssetName(String assetName);
	
	public List<Asset> findAllByAssetType(String assetType);
	
	public List<Asset> findAllByHomeLocation(String homeLocation);
	
	public List<String> findDistinctHomeLocation();
	
	public Asset findById(int theId);
	
	public void save(Asset theAsset);
	
	public void deleteById(int theId);
	
}
