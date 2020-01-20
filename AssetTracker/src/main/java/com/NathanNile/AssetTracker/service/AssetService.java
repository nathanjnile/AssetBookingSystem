package com.NathanNile.AssetTracker.service;

import java.util.List;

import com.NathanNile.AssetTracker.entity.Asset;

public interface AssetService {
	
	public List<Asset> findAll();
	
	public List<Asset> findAllByAssetName(String assetName);
	
	public Asset findById(int theId);
	
	public void save(Asset theAsset);
	
	public void deleteById(int theId);
}
