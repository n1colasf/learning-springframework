package com.nicolasf.springframework.exercisevideo31;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class Video31LauncherApp {

    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(Video31LauncherApp.class)) {

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println(context.getBean(BusinessCalculationService.class).findMax());
        }
    }
}
