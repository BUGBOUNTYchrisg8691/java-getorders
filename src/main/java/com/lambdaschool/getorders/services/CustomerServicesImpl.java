package com.lambdaschool.getorders.services;

import com.lambdaschool.getorders.models.Customer;
import com.lambdaschool.getorders.repositories.CustomerRepository;
import com.lambdaschool.getorders.views.OrderCounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "customerServices")
public class CustomerServicesImpl implements CustomerServices
{
	@Autowired
	CustomerRepository custrepos;
	
	@Transactional
	@Override
	public Customer save(Customer customer)
	{
		return custrepos.save(customer);
	}
	
	@Override
	public List<Customer> findAllCustomers()
	{
		
		List<Customer> retLst = new ArrayList<>();
		custrepos.findAll().iterator().forEachRemaining(retLst::add);
		return retLst;
	}
	
	@Override
	public Customer findCustomerById(long id)
	{
		return custrepos.findById(id).orElseThrow(() -> new EntityNotFoundException("Customer " + id + " not found"));
	}
	
	@Override
	public List<Customer> findCustomersByLikeName(String subname)
	{
		return custrepos.findByCustnameContainingIgnoringCase(subname);
	}
	
	@Override
	public List<OrderCounts> findCustomerOrderCounts()
	{
		return custrepos.findOrderCount();
	}
}
