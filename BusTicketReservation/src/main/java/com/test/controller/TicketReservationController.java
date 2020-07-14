package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.domain.BookingDetails;
import com.test.domain.Bus;
import com.test.service.TicketReservationService;

@RestController
public class TicketReservationController {
	
	@Autowired
	TicketReservationService service;

	@GetMapping("/getbus")
	public List<Bus> getBusDetails(@RequestParam ("source")String source,@RequestParam ("destination")String destination){
		
		return service.getBusDetails(source,destination);
		
	}
	
	@PostMapping("/save")
	public String bookingDetails(@RequestBody BookingDetails bookings){
		
		return service.saveBookings(bookings);
		
	}
	
	
}
