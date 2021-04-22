package com.cg.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entities.Admin;

@Repository
public interface IAdminRepository extends JpaRepository<Admin, Integer>
{	public List<BusOperator> getAllBusOperators();
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
