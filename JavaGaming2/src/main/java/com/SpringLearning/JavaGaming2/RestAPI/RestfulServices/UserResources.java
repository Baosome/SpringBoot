package com.SpringLearning.JavaGaming2.RestAPI.RestfulServices;

import com.SpringLearning.JavaGaming2.RestAPI.RestfulServices.User.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserResources {

    private final UserDaoService userDaoService;

    public UserResources(UserDaoService userDaoService) {
        this.userDaoService = userDaoService;
    }

    @GetMapping("/users")
    List<User> retrieveAllUsers(){
        return userDaoService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    User retrieveAllUsers(@PathVariable int id){
        return userDaoService.getUser(id);
    }

}
