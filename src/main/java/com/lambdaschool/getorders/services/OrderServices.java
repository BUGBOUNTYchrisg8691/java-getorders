package com.lambdaschool.getorders.services;

import com.lambdaschool.getorders.models.Order;
import com.lambdaschool.getorders.views.AdvanceAmounts;

import java.util.List;

public interface OrderServices
{
	Order findOrderById(long ordnum);
	List<AdvanceAmounts> findOrdersByAdvanceAmt();
	Order save(Order order);
}
