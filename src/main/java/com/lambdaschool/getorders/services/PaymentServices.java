package com.lambdaschool.getorders.services;

import com.lambdaschool.getorders.models.Payment;

/**
 * The interface Payment services.
 */
public interface PaymentServices
{
	/**
	 * Save payment.
	 *
	 * @param payment the payment
	 * @return the payment
	 */
	Payment save(Payment payment);
}
