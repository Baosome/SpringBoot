package com.SpringLearning.JavaGaming2.a2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDbDataServicce implements DataService{
    @Override
    public int[] retrieveData() {
        return new int [] {11, 22, 33, 44, 55};
    }

}
