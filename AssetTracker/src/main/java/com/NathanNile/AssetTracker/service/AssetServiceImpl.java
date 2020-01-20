package com.NathanNile.AssetTracker.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NathanNile.AssetTracker.dao.AssetRepository;
import com.NathanNile.AssetTracker.entity.Asset;
import com.NathanNile.AssetTracker.entity.Booking;

@Service
public class AssetServiceImpl implements AssetService {

	private AssetRepository assetRepository;
	
	@Autowired
	public AssetServiceImpl(AssetRepository theAssetRepository) {
		assetRepository = theAssetRepository;
	}
	
	@Override
	public List<Asset> findAll() {
		return assetRepository.findAll();
	}

	@Override
	public Asset findById(int theId) {
		
		Optional<Asset> result = assetRepository.findById(theId);
		
		Asset theAsset = null;
		
		if (result.isPresent()) {
			theAsset = result.get();
		}
		else {
			throw new RuntimeException("Did not find asset id - " + theId);
		}
		
		return theAsset;
	}

	@Override
	public void save(Asset theAsset) {
		assetRepository.save(theAsset);	
	}

	@Override
	public void deleteById(int theId) {
		assetRepository.deleteById(theId);
		
	}

	@Override
	public List<Asset> findAllByAssetName(String assetName) {
		return assetRepository.findAllByAssetName(assetName);
	}
	
	
}
