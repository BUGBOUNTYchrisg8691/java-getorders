package com.lambdaschool.getorders.services;

import com.lambdaschool.getorders.models.Payment;
import com.lambdaschool.getorders.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * The type Payment services.
 */
@Transactional
@Service(value = "paymentServices")
public class PaymentServicesImpl implements PaymentServices
{
	/**
	 * The Payrepos.
	 */
	@Autowired
	PaymentRepository payrepos;
	
	@Transactional
	@Override
	public Payment save(Payment payment)
	{
		return payrepos.save(payment);
	}
}
