package com.joseneto.workshop.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.joseneto.workshop.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
