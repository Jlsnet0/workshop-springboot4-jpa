package com.joseneto.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joseneto.workshop.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

    
}
