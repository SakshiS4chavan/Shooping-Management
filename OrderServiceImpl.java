package org.dnyanyog.service;

import java.util.List;
import java.util.Optional;

import org.dnyanyog.dto.request.OrderRequest;
import org.dnynayog.dto.response.OrderDetailsResponse;
import org.dnynayog.dto.response.OrderResponse;
import org.dnynayog.entity.Order;
import org.dnynayog.repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

  @Autowired OrderRepository orderRepo;

  public OrderResponse createOrder(OrderResponse request) {
    Order orderTable = new Order();
    orderTable.setCoupon(request.getCoupon());
    orderTable.setQuantity(request.getQuantity());
    orderTable = orderRepo.save(request);
    return request;
  }

  @Override
  public Optional<OrderResponse> order(OrderRequest request) { 
    return Optional.empty();
  }

  @Override
  public OrderResponse createOrder(OrderRequest request) { 
    return null;
  }

  @Override
  public List<OrderResponse> getUserOrders(Long userId) {
    List<Order> userOrders = orderRepo.findByUserId(userId);
    return mapToOrderResponseList(userOrders);
  }

  @Override
  public OrderDetailsResponse getOrderDetails1(Long userId, Long orderId) {
    Order order = orderRepo.findByUserIdAndOrderId(userId, orderId);
    if (order != null) {
      return mapToOrderDetailsResponse(order);
    }
    return null; // Return null if order not found
  }

  private List<OrderResponse> mapToOrderResponseList(List<Order> orders) {
    return null;
  }

  private OrderDetailsResponse mapToOrderDetailsResponse(Order order) {
    return null;
  }

  @Override
  public OrderDetailsResponse getOrderDetails(Long userId, Long orderId) {
    return null;
  }
}
