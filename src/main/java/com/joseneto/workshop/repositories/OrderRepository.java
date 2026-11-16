package com.joseneto.workshop.repositories;

import com.joseneto.workshop.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import com.joseneto.workshop.entities.User;

public interface OrderRepository extends JpaRepository<Order, Long> {

    
}
