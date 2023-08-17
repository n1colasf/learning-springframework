package com.nicolasf.springframework.examples.e1;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//SECTION 4: Exploring Bean Scopes (Singleton and Prototype)
// VIDEO 37

@Component
class NormalClass {}

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE) //can also write (value = "prototype")
class PrototypeClass {}


@Configuration
@ComponentScan
public class BeanScopesLauncherApp {
    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(BeanScopesLauncherApp.class)) {

            //Singleton bean, returns the same instance
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));

            //Prototype bean, returns a new instance every time
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
        }
    }
}
