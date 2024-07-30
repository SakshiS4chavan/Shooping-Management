package org.dnynayog.dto.response;

import org.springframework.stereotype.Component;

@Component
public class OrderResponse {

	private Long userId;
	  private int quantity;
	  private String coupon;

	  public Long getUserId() {
	    return userId;
	  }

	  public void setUserId(Long userId) {
	    this.userId = userId;
	  }

	  public int getQuantity() {
	    return quantity;
	  }

	  public void setQuantity(int quantity) {
	    this.quantity = quantity;
	  }

	  public String getCoupon() {
	    return coupon;
	  }

	  public void setCoupon(String coupon) {
	    this.coupon = coupon;
	  }
}
