package org.dnynayog.dto.response;

public class InventoryResponse {

  private int ordered;
  private double price;
  private int available;

  public int getOrdered() {
    return ordered;
  }

  public void setOrdered(int ordered) {
    this.ordered = ordered;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getAvailable() {
    return available;
  }

  public void setAvailable(int available) {
    this.available = available;
  }
}
