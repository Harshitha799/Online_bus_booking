package com.cg.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entities.Booking;
import com.cg.entities.Bus;
import com.cg.entities.BusOperator;
import com.cg.exceptions.InvalidUsernameException;

public interface IBusOperatorRepostory extends JpaRepository<BusOperator, Integer> {

	public void addBus(Bus bus);
	
	public List<Booking> getRevenueByBusRoute(String routeName);
	public List<Booking> getRevenueByBusRouteAndDate(String routeName,LocalDate date);
	public List<Booking> getMonthlyRevenueByBusRoute(String routeName,int month);
	public List<Booking> getYearlyRevenueByBusRoute(String routeName,int year);

	
	public BusOperator singIn(BusOperator busoperator);
	public BusOperator singOut(BusOperator busoperator);
	
	public void addBusOperator(BusOperator busoperator);
	public void updatePassoword(String username,String newpassword)throws InvalidUsernameException;
	
	
}
