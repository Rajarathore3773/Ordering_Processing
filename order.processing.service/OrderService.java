package com.zensar.order.processing.service;

import com.zensar.order.processing.entity.Order;
import com.zensar.order.processing.exception.BussinessException;

public interface OrderService {

	boolean placeOrder (Order order) throws BussinessException;
	
	boolean cancleOrder(int orderId)throws BussinessException;
	
	boolean deleteOrder(int orderId)throws BussinessException;
}
