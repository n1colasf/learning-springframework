package com.nicolasf.springframework.exercisevideo31;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository // Indicates that an annotated class is a "Repository" (performs database operations).
@Primary
public class MongoDBDataService implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[] {1, 2, 3, 4, 5, 6};
    }
}
