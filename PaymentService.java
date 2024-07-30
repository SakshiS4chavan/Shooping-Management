package org.dnyanyog.service;

import org.dnyanyog.dto.request.PaymentRequest;
import org.dnynayog.dto.response.PaymentResponse;

public interface PaymentService {
	
//    PaymentResponse processPayment(Long userId, Long orderId, double amount) throws Exception;

  PaymentResponse processPayment(PaymentRequest request) throws Exception;

}
