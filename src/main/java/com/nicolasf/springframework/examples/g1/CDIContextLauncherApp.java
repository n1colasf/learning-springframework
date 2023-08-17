package com.nicolasf.springframework.examples.g1;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//@Component
@Named // jakarta component annotation (optional, can use spring component)
class CDIBusinessService {
    private CDIDataService dataService;
    public CDIDataService getDataService() {
        return dataService;
    }
    //@Autowired
    @Inject // jakarta inject annotation (optional, can use spring autowired)
    public void setDataService(CDIDataService dataService) {
        System.out.println("Setter injection");
        this.dataService = dataService;
    }
}
//@Component
@Named
class CDIDataService {}

@Configuration
@ComponentScan
public class CDIContextLauncherApp {

    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(CDIContextLauncherApp.class)) {

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println(context.getBean(CDIBusinessService.class).getDataService());
        }
    }
}
