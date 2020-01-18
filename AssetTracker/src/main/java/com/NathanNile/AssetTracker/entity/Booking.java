package com.NathanNile.AssetTracker.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "booking_table")
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "booking_id")
	private int bookingId;
	
	@Column(name = "booker_first_name")
	private String bookerFirstName;
	
	@Column(name = "booker_last_name")
	private String bookerLastName;
	
	@Column(name = "booker_email")
	private String bookerEmail;
	
	@Column(name = "office_location")
	private String officeLocation;
	
	@Column(name = "site_location")
	private String siteLocation;
	
	@Column(name = "start_of_booking")
	@Temporal(TemporalType.DATE)
	private Date startOfBooking;
	
	@Column(name = "end_of_booking")
	@Temporal(TemporalType.DATE)
	private Date endOfBooking;
	
	//@Column(name = "asset_id")
	//private int assetId;
	
	public Booking() {
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getBookerFirstName() {
		return bookerFirstName;
	}

	public void setBookerFirstName(String bookerFirstName) {
		this.bookerFirstName = bookerFirstName;
	}

	public String getBookerLastName() {
		return bookerLastName;
	}

	public void setBookerLastName(String bookerLastName) {
		this.bookerLastName = bookerLastName;
	}

	public String getBookerEmail() {
		return bookerEmail;
	}

	public void setBookerEmail(String bookerEmail) {
		this.bookerEmail = bookerEmail;
	}

	public String getOfficeLocation() {
		return officeLocation;
	}

	public void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
	}

	public String getSiteLocation() {
		return siteLocation;
	}

	public void setSiteLocation(String siteLocation) {
		this.siteLocation = siteLocation;
	}

	public Date getStartOfBooking() {
		return startOfBooking;
	}

	public void setStartOfBooking(Date startOfBooking) {
		this.startOfBooking = startOfBooking;
	}

	public Date getEndOfBooking() {
		return endOfBooking;
	}

	public void setEndOfBooking(Date endOfBooking) {
		this.endOfBooking = endOfBooking;
	}

	public Booking(String bookerFirstName, String bookerLastName, String bookerEmail, String officeLocation,
			String siteLocation, Date startOfBooking, Date endOfBooking) {
		this.bookerFirstName = bookerFirstName;
		this.bookerLastName = bookerLastName;
		this.bookerEmail = bookerEmail;
		this.officeLocation = officeLocation;
		this.siteLocation = siteLocation;
		this.startOfBooking = startOfBooking;
		this.endOfBooking = endOfBooking;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", bookerFirstName=" + bookerFirstName + ", bookerLastName="
				+ bookerLastName + ", bookerEmail=" + bookerEmail + ", officeLocation=" + officeLocation
				+ ", siteLocation=" + siteLocation + ", startOfBooking=" + startOfBooking + ", endOfBooking="
				+ endOfBooking + "]";
	}
	
}
