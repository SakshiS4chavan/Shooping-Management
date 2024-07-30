package org.dnynayog.dto.response;

public class PayementFailureException extends Exception {
    private int statusCode;
    private String description;

    public PayementFailureException(int statusCode, String description) {
        this.statusCode = statusCode;
        this.description = description;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getDescription() {
        return description;
    }
}