package org.dnyanyog.service;

import java.util.List;
import java.util.Optional;

import org.dnyanyog.dto.request.OrderRequest;
import org.dnynayog.dto.response.OrderDetailsResponse;
import org.dnynayog.dto.response.OrderResponse;
import org.dnynayog.entity.Order;

public interface OrderService {
	

  Optional<OrderResponse> order(OrderRequest request);

OrderResponse createOrder(OrderRequest request);

List<OrderResponse> getUserOrders(Long userId);
OrderDetailsResponse getOrderDetails(Long userId, Long orderId);

OrderDetailsResponse getOrderDetails1(Long userId,Long orderId);
	}


