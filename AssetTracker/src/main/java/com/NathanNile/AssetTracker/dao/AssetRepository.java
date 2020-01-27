package com.NathanNile.AssetTracker.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.NathanNile.AssetTracker.entity.Asset;

public interface AssetRepository extends JpaRepository<Asset, Integer> {

	List<Asset> findAllByAssetName(String assetName);
	
	List<Asset> findAllByAssetType(String assetType);
	
	List<Asset> findAllByHomeLocation(String homeLocation);
	
//	@Query("SELECT new com.NathanNile.AssetTracker.entity.BookingDTO(c.AssetName, o.bookerFirstName, o.bookerLastName, o.bookerEmail, o.officeLocation, o.siteLocation, o.startOfBooking, o.endOfBooking, o.bookingId) "
//			+ "FROM Asset c INNER JOIN Booking o")
//	List<BookingDTO> fetchBookingDTOInnerJoin();
	// add method to sort by last name
	
	// public List<Asset> findAllByOrderByLastNameAsc();
	
	List<Asset> findByBookingsAssetId(int assetId);
	
	@Query("SELECT DISTINCT a.homeLocation FROM Asset a")
	  List<String> findDistinctHomeLocation();
}
