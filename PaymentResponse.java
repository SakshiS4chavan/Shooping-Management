package org.dnynayog.dto.response;

import org.springframework.stereotype.Component;

@Component
public class PaymentResponse {

  private Long userId;
  private Long orderId;
  private String transactionId;
  private String status;
  private String description;

  public PaymentResponse(Long userId2,Long orderId2,String string,String string2){
  // TODO Auto-generated constructor stub}
  }

public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
