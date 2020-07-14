package com.test.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.domain.BookingDetails;
import com.test.domain.Bus;
import com.test.repository.TicketReservationRepository;

@Service
public class TicketReservationService {

	@Autowired
	TicketReservationRepository repo;
	
	public List<Bus> getBusDetails(String source, String destination) {
		
		return repo.getBusDetails(source,destination);
		
	}
	public String saveBookings(BookingDetails bookings) {
		repo.bookSeat(bookings);
		return "Successfully booked";
	}

}
