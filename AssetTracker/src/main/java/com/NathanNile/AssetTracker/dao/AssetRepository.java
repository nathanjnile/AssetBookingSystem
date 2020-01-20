package com.NathanNile.AssetTracker.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.NathanNile.AssetTracker.entity.Asset;

public interface AssetRepository extends JpaRepository<Asset, Integer> {

	List<Asset> findAllByAssetName(String assetName);
	
	
	// add method to sort by last name
	
	// public List<Asset> findAllByOrderByLastNameAsc();
}
