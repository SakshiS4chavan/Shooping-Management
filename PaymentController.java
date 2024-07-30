package org.dnyanyog.controller;

import org.dnyanyog.dto.request.OrderRequest;
import org.dnyanyog.dto.request.PaymentRequest;
import org.dnyanyog.service.PaymentService;
import org.dnynayog.dto.response.ErrorResponse;
import org.dnynayog.dto.response.PaymentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public class PaymentController {
	
	@Autowired
    private PaymentService paymentService;

    @PostMapping("/{userId}/{orderId}/pay")
    public PaymentResponse processpayment(@RequestBody PaymentRequest request) throws Exception {
        return paymentService.processPayment(request);

    }
}
