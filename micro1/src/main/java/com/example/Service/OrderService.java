package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Order;
import com.example.Repository.OrderRepository;

@Service
public class OrderService {
 @Autowired
	private OrderRepository repository;
 public Order saveOrder(Order order) {
	 return repository.save(order);
 }
}
