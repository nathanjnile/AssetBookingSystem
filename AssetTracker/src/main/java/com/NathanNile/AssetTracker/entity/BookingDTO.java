package com.NathanNile.AssetTracker.entity;

import java.util.Date;

public class BookingDTO {
	
	private String dAssetName;
	private String dBookerFirstName;
	private String dBookerLastName;
	private String dBookerEmail;
	private String dOfficeLocation;
	private String dSiteLocation;
	private Date dStartOfBooking;
	private Date dEndOfBooking;
	private int dAssetId;
	
	public BookingDTO() {
		
	}

	public BookingDTO(String dAssetName, String dBookerFirstName, String dBookerLastName, String dBookerEmail,
			String dOfficeLocation, String dSiteLocation, Date dStartOfBooking, Date dEndOfBooking, int dAssetId) {
		this.dAssetName = dAssetName;
		this.dBookerFirstName = dBookerFirstName;
		this.dBookerLastName = dBookerLastName;
		this.dBookerEmail = dBookerEmail;
		this.dOfficeLocation = dOfficeLocation;
		this.dSiteLocation = dSiteLocation;
		this.dStartOfBooking = dStartOfBooking;
		this.dEndOfBooking = dEndOfBooking;
		this.dAssetId = dAssetId;
	}

	public String getdAssetName() {
		return dAssetName;
	}

	public void setdAssetName(String dAssetName) {
		this.dAssetName = dAssetName;
	}

	public String getdBookerFirstName() {
		return dBookerFirstName;
	}

	public void setdBookerFirstName(String dBookerFirstName) {
		this.dBookerFirstName = dBookerFirstName;
	}

	public String getdBookerLastName() {
		return dBookerLastName;
	}

	public void setdBookerLastName(String dBookerLastName) {
		this.dBookerLastName = dBookerLastName;
	}

	public String getdBookerEmail() {
		return dBookerEmail;
	}

	public void setdBookerEmail(String dBookerEmail) {
		this.dBookerEmail = dBookerEmail;
	}

	public String getdOfficeLocation() {
		return dOfficeLocation;
	}

	public void setdOfficeLocation(String dOfficeLocation) {
		this.dOfficeLocation = dOfficeLocation;
	}

	public String getdSiteLocation() {
		return dSiteLocation;
	}

	public void setdSiteLocation(String dSiteLocation) {
		this.dSiteLocation = dSiteLocation;
	}

	public Date getdStartOfBooking() {
		return dStartOfBooking;
	}

	public void setdStartOfBooking(Date dStartOfBooking) {
		this.dStartOfBooking = dStartOfBooking;
	}

	public Date getdEndOfBooking() {
		return dEndOfBooking;
	}

	public void setdEndOfBooking(Date dEndOfBooking) {
		this.dEndOfBooking = dEndOfBooking;
	}

	public int getdAssetId() {
		return dAssetId;
	}

	public void setdAssetId(int dAssetId) {
		this.dAssetId = dAssetId;
	}
	
	
	
	

	
}
