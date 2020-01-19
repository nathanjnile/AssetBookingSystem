package com.NathanNile.AssetTracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NathanNile.AssetTracker.dao.AssetRepository;
import com.NathanNile.AssetTracker.entity.Asset;

@Service
public class AssetServiceImpl implements AssetService {

	private AssetRepository assetRepository;
	
	@Autowired
	public AssetServiceImpl(AssetRepository theAssetRepository) {
		assetRepository = theAssetRepository;
	}
	
	@Override
	public List<Asset> findAll() {
		
		
		return null;
	}

	@Override
	public Asset findById(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Asset theAsset) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		
	}

}
