package com.example.userblog;

import com.github.javafaker.Faker;
import com.github.slugify.Slugify;
import org.hibernate.engine.spi.SessionDelegatorBaseImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.persistence.EntityManager;
import java.util.Random;

@SpringBootApplication
public class UserblogApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserblogApplication.class, args);
    }

    @Bean
    public Faker faker(){
        return new Faker();
    }

    @Bean
    public Slugify slugify(){
        return new Slugify();
    }

    @Bean
    public Random random(){
        return new Random();
    }



}
