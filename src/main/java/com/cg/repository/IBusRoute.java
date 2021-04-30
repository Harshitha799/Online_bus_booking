package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entity.BusRoute10;

@Repository
public interface IBusRoute extends JpaRepository<BusRoute10, Integer> {

}