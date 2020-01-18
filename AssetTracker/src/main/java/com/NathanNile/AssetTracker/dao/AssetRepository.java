package com.NathanNile.AssetTracker.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.NathanNile.AssetTracker.entity.Asset;

public interface AssetRepository extends JpaRepository<Asset, Integer> {
	
	
	// add method to sort by last name
	
	// public List<Asset> findAllByOrderByLastNameAsc();
}
