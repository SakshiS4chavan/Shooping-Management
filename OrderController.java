package org.dnyanyog.controller;

import java.util.Optional;

import org.dnyanyog.dto.request.OrderRequest;
import org.dnyanyog.service.OrderService;
import org.dnynayog.dto.response.ErrorResponse;
import org.dnynayog.dto.response.OrderResponse;
import org.dnynayog.entity.Order;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {

  @Autowired
  private OrderService orderService;

  @PostMapping("/api/order")
  public OrderResponse createOrder(@RequestBody OrderRequest request) {
	    return orderService.createOrder(request);

  }
}
