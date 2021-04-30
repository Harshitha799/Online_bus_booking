package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entity.Bus10;

@Repository
public interface IBus extends JpaRepository<Bus10, Integer> {

}