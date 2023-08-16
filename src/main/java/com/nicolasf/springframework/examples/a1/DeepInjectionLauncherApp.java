package com.nicolasf.springframework.examples.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class YourBusinessClass {
    //Field injection
    Dependency1 dependency1;
    //@Autowired
    Dependency2 dependency2;

    //Constructor injection
    //@Autowired --> No need to use @Autowired annotation if there is only one constructor
    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        super();
        System.out.println("Constructor Injection");
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }
 /*
    //Setter injection
    @Autowired
    public void setDependency1(Dependency1 dependency1) {
        System.out.println("Setter Injection - dependency1");
        this.dependency1 = dependency1;
    }
    @Autowired
    public void setDependency2(Dependency2 dependency2) {
        System.out.println("Setter Injection - dependency2");
        this.dependency2 = dependency2;
    }*/

    public String toString() {
        return "Using " + dependency1 + " and " + dependency2;
    }
 }
@Component
class Dependency1 {
}
@Component
class Dependency2 {
}
@Configuration
@ComponentScan // --> No need to specify the package if the class is in the same package
public class DeepInjectionLauncherApp {
    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(DeepInjectionLauncherApp.class)) {

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println(context.getBean(YourBusinessClass.class));
        }
    }
}