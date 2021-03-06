package com.microservices.bookmyshow.theatrecatalogueservice.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Show {
	
	
	@Id
	@GeneratedValue
	private int showId;
	private int theatreId;
	private java.time.LocalDateTime showTime;
	// Indicate if Available, Almost full or House Full
	private String status;
	private int totalSeats;
	private int availableSeats;
	
	public Show() {
		
	}
	
	
	public Show(int showId, int theatreId, LocalDateTime showTime, String status, int totalSeats, int availableSeats) {
		super();
		this.showId = showId;
		this.theatreId = theatreId;
		this.showTime = showTime;
		this.status = status;
		this.totalSeats = totalSeats;
		this.availableSeats = availableSeats;
	}

	public int getShowId() {
		return showId;
	}
	public void setShowId(int showId) {
		this.showId = showId;
	}
	
	public int getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}
	public java.time.LocalDateTime getShowTime() {
		return showTime;
	}
	public void setShowTime(java.time.LocalDateTime showTime) {
		this.showTime = showTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
}
