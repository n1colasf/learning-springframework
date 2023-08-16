package com.nicolasf.springframework.exercisevideo31;

import org.springframework.stereotype.Component;
@Component
public class MySQLDataService implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[] {11, 22, 33, 44, 55, 66};
    }
}
