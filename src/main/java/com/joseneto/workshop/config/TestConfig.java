package com.joseneto.workshop.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.joseneto.workshop.entities.User;
import com.joseneto.workshop.repositories.UserRepository;

@Configuration 
@Profile ("test")
public class TestConfig implements CommandLineRunner{

    @Autowired 
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "José", "jose@gmail.com", "9888888888", "12345");
        User u2 = new User(null, "Renata", "renata@gmail.com", "9999999999", "12345");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }


}
