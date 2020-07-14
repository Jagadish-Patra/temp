package com.test.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class BookingDetails {

	@Id
	private int bookingId;
	
	@Column
	private int busId;
	
	@Column
	private int noOfBooking;
	
	
	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public int getBusId() {
		return busId;
	}

	public void setBusId(int busId) {
		this.busId = busId;
	}

	public int getNoOfBooking() {
		return noOfBooking;
	}

	public void setNoOfBooking(int noOfBooking) {
		this.noOfBooking = noOfBooking;
	}

	
	
}
