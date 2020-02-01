package com.NathanNile.AssetTracker.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "asset_table")
public class Asset {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@NotNull(message = "null")
	@Size(min = 1, message = "Asset Name: Nothing Entered!")
	@Column(name = "asset_name")
	private String assetName;
	
	@NotNull(message = "null")
	@Size(min = 1, message = "Asset Type: Nothing Entered!")
	@Column(name = "asset_type")
	private String assetType;
	
	@NotNull(message = "null")
	@Size(min = 1, message = "Asset Owner Email: Nothing Entered!")
	@Column(name = "asset_owner_email")
	private String assetOwnerEmail;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "asset_id")
	private List<Booking> bookings;
	
	public Asset () {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public String getAssetType() {
		return assetType;
	}

	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public String getAssetOwnerEmail() {
		return assetOwnerEmail;
	}

	public void setAssetOwnerEmail(String assetOwnerEmail) {
		this.assetOwnerEmail = assetOwnerEmail;
	}
	
	public List<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}
	
	public Asset(String assetName, String assetType, String assetOwnerEmail) {
		this.assetName = assetName;
		this.assetType = assetType;
		this.assetOwnerEmail = assetOwnerEmail;
	}
	
public void addBooking(Booking theBooking) {
		
		if(bookings == null) {
			bookings = new ArrayList<>();
		}
		
		bookings.add(theBooking);
	}

	@Override
	public String toString() {
		return "Asset [id=" + id + ", assetName=" + assetName + ", assetType=" + assetType + ", assetOwnerEmail="
				+ assetOwnerEmail + "]";
	}
	
	
	
	

}
