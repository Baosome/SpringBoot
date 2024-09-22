package com.SpringLearning.JavaGaming2.RestAPI.RestfulServices;

import com.SpringLearning.JavaGaming2.RestAPI.RestfulServices.User.User;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;

@Component
public class UserDaoService {

    private static final List<User> users = new ArrayList<User>();

    private static int counter = 0;

    static {
        users.add(new User(++counter, "Adam", LocalDate.now().minusYears(3)));
        users.add(new User(++counter, "Eve", LocalDate.now().minusYears(2)));
        users.add(new User(++counter, "Cain", LocalDate.now().minusYears(1)));

    }

    public List<User> getAllUsers() {
        return users;
    }

    public User getUser(int id) {
        Predicate<? super User> predicate = u -> u.getId() == id;
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public void DeleteById(int id) {
        Predicate<? super User> predicate = u -> u.getId() == id;
        users.removeIf(predicate);
    }

    void Save(User user) {
        user.setId(++counter);
        users.add(user);
    }
}



