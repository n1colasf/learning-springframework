package com.nicolasf.springframework.examples.f1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;
//SECTION 4: Pre and Post Construct Annotations
// VIDEO 39

@Component
class SomeClass {
    private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency) {
        super();
        this.someDependency = someDependency;
        System.out.println("Dependencies ready.");
    }
    @PostConstruct // This annotation is used to indicate that a method should be invoked after a bean is initialized.
    public void initialize() {
        someDependency.getReady();    
    }

    @PreDestroy // This annotation is used to indicate that a method should be invoked before a bean is destroyed.
    public void cleanup() {
        System.out.println("Cleaning or closing connections.");
    }
}

@Component
class SomeDependency {
    public void getReady() {
        System.out.println("Logic using some dependency.");
    }
}
@Configuration
@ComponentScan
public class PrePostAnnotationsContextLauncherApp {

    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(PrePostAnnotationsContextLauncherApp.class)) {

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
