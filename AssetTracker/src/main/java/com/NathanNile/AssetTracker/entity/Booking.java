package com.NathanNile.AssetTracker.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
	private Date startOfBooking;
	
	@Column(name = "end_of_booking")
	private Date endOfBooking;
	
	
	

}
