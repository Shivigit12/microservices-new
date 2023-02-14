package com.projectdemo.orderservice1.repository;

import com.projectdemo.orderservice1.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
