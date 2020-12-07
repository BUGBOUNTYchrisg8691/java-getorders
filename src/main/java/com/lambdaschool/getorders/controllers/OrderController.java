package com.lambdaschool.getorders.controllers;

import com.lambdaschool.getorders.models.Order;
import com.lambdaschool.getorders.services.OrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController
{
	@Autowired
	private OrderServices orderServices;
	//	GET /orders/order/{id} - Returns the order and its customer with the given order number
	@GetMapping(value = "/order/{ordnum}", produces = {"application/json"})
	public ResponseEntity<?> getOrderById(@PathVariable long ordnum)
	{
		Order retOrd = orderServices.findOrderById(ordnum);
		return new ResponseEntity<>(retOrd, HttpStatus.OK);
	}
	
	/*  Stretch
		GET /orders/advanceamount - returns all orders with their customers
		that have an advanceamount greater than 0. */
}
