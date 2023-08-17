package com.nicolasf.springframework.examples.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
//SECTION 4: Exploring Lazy and Eager Bean Initialization
// VIDEO 35

@Component
class ClassA {}

@Component
@Lazy //This annotation makes the bean initialization lazy, not eager (rarely used)
// consume memory only when used
class ClassB {
    public ClassA classA;
    public ClassB(ClassA classA) {
        System.out.println("Initialization logic");
        this.classA = classA;
    }
    public void doSomething() {
        System.out.println("Doing something");
    }
}
@Configuration
@ComponentScan
public class LazaInitLauncherApp {

    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(LazaInitLauncherApp.class)) {

            System.out.println("Context initialized");

            context.getBean(ClassB.class).doSomething();
        }
    }
}
