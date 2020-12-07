package com.lambdaschool.getorders.repositories;

import com.lambdaschool.getorders.models.Customer;
import com.lambdaschool.getorders.views.OrderCounts;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * The interface Customer repository.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long>
{
	List<Customer> findByCustnameContainingIgnoringCase(String subname);
	
	@Query(value = "SELECT c.custname name, count(ordnum) orderscount " +
			"FROM orders o LEFT JOIN customers c " +
			"ON o.custcode = c.custcode " +
			"GROUP BY c.custname " +
			"ORDER BY orderscount DESC", nativeQuery = true)
	List<OrderCounts> findOrderCount();
}
