package com.lambdaschool.getorders.services;

import com.lambdaschool.getorders.models.Order;

public interface OrderServices
{
	Order findOrderById(long ordnum);
	Order save(Order order);
}
