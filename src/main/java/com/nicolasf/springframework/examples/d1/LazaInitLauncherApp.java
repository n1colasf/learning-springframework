package com.nicolasf.springframework.examples.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//SECTION 4: Exploring Lazy and Eager Bean Initialization

@Component
class ClassA {}

@Component
class ClassB {}
@Configuration
@ComponentScan
public class LazaInitLauncherApp {

    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(LazaInitLauncherApp.class)) {

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
