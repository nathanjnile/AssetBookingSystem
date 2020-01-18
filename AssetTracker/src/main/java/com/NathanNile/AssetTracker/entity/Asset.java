package com.NathanNile.AssetTracker.entity;

public class Asset {
	
	private int id;
	private String assetName;
	private String assetType;
	private String assetOwnerEmail;
	private String homeLocation;
	
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

	public String getHomeLocation() {
		return homeLocation;
	}

	public void setHomeLocation(String homeLocation) {
		this.homeLocation = homeLocation;
	}

	public Asset(String assetName, String assetType, String assetOwnerEmail, String homeLocation) {
		this.assetName = assetName;
		this.assetType = assetType;
		this.assetOwnerEmail = assetOwnerEmail;
		this.homeLocation = homeLocation;
	}

	@Override
	public String toString() {
		return "Asset [id=" + id + ", assetName=" + assetName + ", assetType=" + assetType + ", assetOwnerEmail="
				+ assetOwnerEmail + ", homeLocation=" + homeLocation + "]";
	}
	
	
	
	

}
