package com.NathanNile.AssetTracker.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "booking_table")
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "booking_id")
	private int bookingId;
	
	//@NotNull(message="is required")
	//@NotEmpty(message = "Hello")
	@Size(min=1, message = "Too small bruh")
	@Column(name = "booker_first_name")
	private String bookerFirstName;
	
	//@NotNull(message="is required")
	@Column(name = "booker_last_name")
	private String bookerLastName;
	
	//@NotNull(message="is required")
	@Column(name = "booker_email")
	private String bookerEmail;
	
	//@NotNull(message="is required")
	@Column(name = "start_of_booking")
	//@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "YYYY-MM-dd")
	private String startOfBooking;
	
	//@NotNull(message="is required")
	@Column(name = "end_of_booking")
	//@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "YYYY-MM-dd")
	private String endOfBooking;
	
	@Column(name = "asset_id")
	private int assetId;
	

	
	public Booking() {
	}

	public int getAssetId() {
		return assetId;
	}

	public void setAssetId(int assetId) {
		this.assetId = assetId;
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

	public String getStartOfBooking() {
		return startOfBooking;
	}

	public void setStartOfBooking(String startOfBooking) {
		this.startOfBooking = startOfBooking;
	}

	public String getEndOfBooking() {
		return endOfBooking;
	}

	public void setEndOfBooking(String endOfBooking) {
		this.endOfBooking = endOfBooking;
	}

	public Booking(String bookerFirstName, String bookerLastName, String bookerEmail, String officeLocation,
			String startOfBooking, String endOfBooking) {
		this.bookerFirstName = bookerFirstName;
		this.bookerLastName = bookerLastName;
		this.bookerEmail = bookerEmail;
		this.startOfBooking = startOfBooking;
		this.endOfBooking = endOfBooking;
	}
	
	
	public Booking(int assetId) {
		this.assetId = assetId;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", bookerFirstName=" + bookerFirstName + ", bookerLastName="
				+ bookerLastName + ", bookerEmail=" + bookerEmail 
				+  ", startOfBooking=" + startOfBooking + ", endOfBooking="
				+ endOfBooking + "]";
	}
	
}
