package org.dnynayog.dto.response;

import org.springframework.stereotype.Component;

@Component
public class ErrorResponse {
	
	 private String description;

	    public ErrorResponse(String description) {
	        this.description = description;
	    }
}
