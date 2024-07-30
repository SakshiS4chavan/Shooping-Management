package org.dnyanyog.service;

import java.util.Random;

import org.dnyanyog.dto.request.PaymentRequest;
import org.dnynayog.dto.response.PaymentResponse;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Override
	public PaymentResponse processPayment(PaymentRequest request) throws Exception {
	    // Extracting values from the request
	    Long userId = request.getUserId();
	    Long orderId = request.getOrderId();
	    String amount = request.getAmount();

	    // Mocking payment API response with random status codes
	    int statusCode = getRandomStatusCode();
	    switch (statusCode) {
	        case 200:
	            return new PaymentResponse(userId, orderId, "tran01010003", "successful");
	        case 400:
	            throw new Exception("Payment Failed as amount is invalid");
	        case 504:
	            throw new Exception("No response from payment server");
	        // Add more cases for other status codes
	        default:
	            throw new Exception("Unknown error occurred");
	    }
	}

	// Mock method to generate random status codes
	private int getRandomStatusCode() {
	    int[] statusCodes = {200, 400, 504};
	    Random random = new Random();
	    return statusCodes[random.nextInt(statusCodes.length)];
	}
    
  
}