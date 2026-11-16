package com.joseneto.workshop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.joseneto.workshop.entities.Order;
import com.joseneto.workshop.repositories.OrderRepository;


@Service 
public class OrderServices {

    @Autowired
    private OrderRepository repository;

    public List<Order> findaAll() {
        return repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj =  repository.findById(id);
        return obj.get();
    }

    
}
