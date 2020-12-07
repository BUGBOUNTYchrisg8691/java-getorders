package com.lambdaschool.getorders.services;


import com.lambdaschool.getorders.models.Customer;
import com.lambdaschool.getorders.views.OrderCounts;

import java.util.List;

public interface CustomerServices
{
	List<Customer> findAllCustomers();
	Customer findCustomerById(long id);
	List<Customer> findCustomersByLikeName(String likename);
	List<OrderCounts> findCustomerOrderCounts();
	
	Customer save(Customer customer);
}
