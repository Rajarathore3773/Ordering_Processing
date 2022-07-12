package com.zensar.order.processing.service;

import java.sql.SQLException;

import com.zensar.order.processing.entity.Order;
import com.zensar.order.processing.exception.BussinessException;
import com.zensar.order.processing.repository.OrderRepository;

public class OrderServiceImpl implements OrderService {
	
	private OrderRepository orderRepository;
	
	public OrderRepository getOrderRepository() {
		return orderRepository;
	}

	public void setOrderRepository(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	//OrderService  ki unimplemented  method hai
	public boolean placeOrder(Order order) throws BussinessException {
		// TODO Auto-generated method stub
		try {
			int result = orderRepository.create(order);
			if(result ==0) {
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new BussinessException(e);
		}
		return true;
	}

	public boolean cancleOrder(int orderId) throws BussinessException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteOrder(int orderId) throws BussinessException {
		// TODO Auto-generated method stub
		return false;
	}

}
