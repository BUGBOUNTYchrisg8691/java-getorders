package com.lambdaschool.getorders.services;

import com.lambdaschool.getorders.models.Order;
import com.lambdaschool.getorders.repositories.OrderRepository;
import com.lambdaschool.getorders.views.AdvanceAmounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.List;

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
		
		return ordrepos.findById(ordnum).orElseThrow(() -> new EntityNotFoundException("Order " + ordnum + " not found"));
	}
	
	@Override
	public List<AdvanceAmounts> findOrdersByAdvanceAmt()
	{
		return ordrepos.findByAdvanceAmt();
	}
}
