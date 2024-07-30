package org.dnyanyog.dto.request;

import org.springframework.stereotype.Component;

@Component
public class PaymentRequest {

  private Long userId;
  private Long orderId;
  private String amount;

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

  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }
}
