package com.coursejava.StartSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursejava.StartSpringBoot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>  {

}
