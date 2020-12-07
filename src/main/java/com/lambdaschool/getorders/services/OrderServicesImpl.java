package com.lambdaschool.getorders.services;

import com.lambdaschool.getorders.models.Order;
import com.lambdaschool.getorders.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Transactional
@Service(value = "orderServices")
public class OrderServicesImpl implements OrderServices
{
	@Autowired
	OrderRepository ordrepos;
	
	@Transactional
	@Override
	public Order save(Order order)
	{
		return ordrepos.save(order);
	}
	
	@Override
	public Order findOrderById(long ordnum)
	{
		Order retOrd =
				ordrepos.findById(ordnum).orElseThrow(() -> new EntityNotFoundException("Order " + ordnum + " not found"));
		
		return retOrd;
	}
}
