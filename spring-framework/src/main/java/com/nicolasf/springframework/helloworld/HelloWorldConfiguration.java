package com.nicolasf.springframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age) {};
record Address(String street, int number) {};

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Nicolas";
    }
    @Bean
    public int age() {
        return 36;
    }
    @Bean
    public Person person() {
        return new Person("Nico", 25);
    }
    @Bean
    public Address address() {
        return new Address("Av. Gral. Rivera", 1234);
    }
}
