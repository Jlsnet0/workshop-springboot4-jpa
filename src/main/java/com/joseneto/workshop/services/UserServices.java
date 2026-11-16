package com.joseneto.workshop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.joseneto.workshop.entities.User;
import com.joseneto.workshop.repositories.UserRepository;

@Service 
public class UserServices {

    @Autowired
    private UserRepository repository;

    public List<User> findaAll() {
        return repository.findAll();
    }

    public User findById(Long id){
        Optional<User> obj =  repository.findById(id);
        return obj.get();
    }

    
}
