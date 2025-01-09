package com.study.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.course.entities.OrderItem;
import com.study.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
}
