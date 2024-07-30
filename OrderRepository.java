package org.dnynayog.repo;

import java.util.List;

import org.dnyanyog.dto.request.OrderRequest;
import org.dnynayog.dto.response.OrderResponse;
import org.dnynayog.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface OrderRepository extends JpaRepository<Order, Long> {

  Order save(OrderResponse request);

List<Order> findByUserId(Long userId);

Order findByUserIdAndOrderId(Long userId,Long orderId);

	
}
