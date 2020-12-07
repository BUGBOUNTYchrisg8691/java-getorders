package com.lambdaschool.getorders.repositories;

import com.lambdaschool.getorders.models.Order;
import org.springframework.data.repository.CrudRepository;

/**
 * The interface Order repository.
 */
public interface OrderRepository extends CrudRepository<Order, Long>
{
}
