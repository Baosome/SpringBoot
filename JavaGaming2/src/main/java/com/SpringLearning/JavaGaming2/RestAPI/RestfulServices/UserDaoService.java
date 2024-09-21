package com.SpringLearning.JavaGaming2.RestAPI.RestfulServices;

import com.SpringLearning.JavaGaming2.RestAPI.RestfulServices.User.User;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;

@Component
public class UserDaoService {

    private static final List<User> users = new ArrayList<User>();

    static {
        users.add(new User(1, "Adam", LocalDate.now().minusYears(3)));
        users.add(new User(2, "Eve", LocalDate.now().minusYears(2)));
        users.add(new User(3, "Cain", LocalDate.now().minusYears(1)));

    }

    public List<User> getAllUsers() {
        return users;
    }

    public User getUser(int id) {
        Predicate<? super User> predicate = u -> u.getId() == id;
        return users.stream().filter(predicate).findFirst().get();
    }
}



