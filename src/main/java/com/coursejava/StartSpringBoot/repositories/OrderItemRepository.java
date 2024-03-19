package com.coursejava.StartSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursejava.StartSpringBoot.entities.Category;
import com.coursejava.StartSpringBoot.entities.OrderItem;
import com.coursejava.StartSpringBoot.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
