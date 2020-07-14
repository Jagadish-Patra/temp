package com.test.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.domain.BookingDetails;
import com.test.domain.Bus;

@Repository
@Transactional
public class TicketReservationRepository {
	
	@Autowired
	static EntityManager entityManager;
	
	@Autowired
	private SessionFactory sessionFactory;
 
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	

	public List<Bus> getBusDetails(String source, String destination) {
		
		String sqlString="Select * from BusTable where source='"+source+"' and destination='"+destination+"'";
		Query query=entityManager.createNativeQuery(sqlString);
		List<Bus> list=query.getResultList();
		return list;
	}

public void bookSeat(BookingDetails bookingDetails) {
		
	Session session = sessionFactory.getCurrentSession();	
	Transaction tx=session.beginTransaction();
	tx.begin();
	session.save(bookingDetails);
	tx.commit();
	session.close();
	}
}
