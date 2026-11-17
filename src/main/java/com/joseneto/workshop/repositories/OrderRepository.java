package com.joseneto.workshop.repositories;

import com.joseneto.workshop.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;



public interface OrderRepository extends JpaRepository<Order, Long> {

    
}
