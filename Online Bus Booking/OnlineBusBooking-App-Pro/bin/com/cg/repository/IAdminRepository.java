package com.cg.repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.cg.entities.AdminUser;
import com.cg.entities.Bus;
import com.cg.entities.BusOperator;
import com.cg.entities.BusOperatorRequest;
import com.cg.entities.BusRoute;
import com.cg.entities.User;

public interface IAdminRepository {

	public List<BusOperator> getAllBusOperators();
	public List<BusOperator> getAllBusOperatorsByRoute(String routeName);
	public List<BusOperatorRequest> getAllBusOperatorsRequest();
	
	public void updateBusTime(Bus bus,LocalTime newSourceTime,LocalTime newDestinationTime);
	public void updateBusRoute(Bus bus,BusRoute newBusRoute);
	public void updateBusFare(Bus bus,int newFare);
	
	public void deleteBus(Bus bus);
	public void deleteBusByOperator(String busOperatorUserName);
	
	public int getRevenueByDate(LocalDate date);
	public int getRevenueByBusRoute(String routeName);
	public int getRevenueByBusOperator(String operatorUsername);
	
	public AdminUser singIn(AdminUser user);
	public AdminUser singOut(AdminUser user);
	
}
