package com.app.toy_store_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.toy_store_app.model.Order;

public interface OrderRepo extends JpaRepository<Order, Long> {

}
