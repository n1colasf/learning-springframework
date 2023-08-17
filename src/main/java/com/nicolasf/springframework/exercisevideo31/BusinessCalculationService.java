package com.nicolasf.springframework.exercisevideo31;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;
//SECTION 4: Spring framework Stereotype Annotations (Service, Repository, Controller, Component)
//VIDEO 45

//@Component
@Service // Indicates that an annotated class is a "Service" (has business logic).
public class BusinessCalculationService {
    private DataService dataService;

    // Constructor injection
    public BusinessCalculationService(DataService dataService) {
        super();
        this.dataService = dataService;
    }

    public int findMax() {
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
