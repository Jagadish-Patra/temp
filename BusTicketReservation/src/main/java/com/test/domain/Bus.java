package com.test.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Bus {

	@Id
	private Integer busId;
	
	@Column
	private String busOperatorName;
	
	@Column
	private Integer ticketPrice;
	
	@Column
	private Date arrivalTime;
	
	@Column
	private Date deprtTime;
	
	@Column
	private String duration;
	
	
	@Column
	private String source;
	
	@Column
	private String destination;
	
	private int avaliableSeat;
	
	private int totalSeat=60;
	
	public int getAvaliableSeat() {
		return avaliableSeat;
	}

	public void setAvaliableSeat(int avaliableSeat) {
		this.avaliableSeat = avaliableSeat;
	}


	public Integer getBusId() {
		return busId;
	}

	public void setBusId(Integer busId) {
		this.busId = busId;
	}

	public String getBusOperatorName() {
		return busOperatorName;
	}

	public void setBusOperatorName(String busOperatorName) {
		this.busOperatorName = busOperatorName;
	}

	public Integer getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(Integer ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public Date getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public Date getDeprtTime() {
		return deprtTime;
	}

	public void setDeprtTime(Date deprtTime) {
		this.deprtTime = deprtTime;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
	
}
