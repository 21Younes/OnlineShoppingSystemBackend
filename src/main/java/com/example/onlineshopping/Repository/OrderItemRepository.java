package com.example.onlineshopping.Repository;

import com.example.onlineshopping.Model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderItemRepository  extends JpaRepository<OrderItem, Long> {
    List<OrderItem> findByOrder_OrderId(Long orderId);

}
