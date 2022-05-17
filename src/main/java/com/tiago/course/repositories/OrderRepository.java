package com.tiago.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiago.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	

}
