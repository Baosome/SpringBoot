package com.SpringLearning.JavaGaming2.a8;

import org.springframework.context.annotation.Primary;

import org.springframework.stereotype.Repository;

@Repository
@Primary
public class MongoDbDataServicce implements DataService{
    @Override
    public int[] retrieveData() {
        return new int [] {11, 22, 33, 44, 55};
    }

}
