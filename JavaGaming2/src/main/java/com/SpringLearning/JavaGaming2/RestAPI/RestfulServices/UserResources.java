package com.SpringLearning.JavaGaming2.RestAPI.RestfulServices;

import com.SpringLearning.JavaGaming2.RestAPI.RestfulServices.Exceptions.UserNotFoundException;
import com.SpringLearning.JavaGaming2.RestAPI.RestfulServices.User.User;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserResources {

    private final UserDaoService userDaoService;

    public UserResources(UserDaoService userDaoService) {
        this.userDaoService = userDaoService;
    }

    @GetMapping("/users")
    List<User> RetrieveAllUsers(){
        return userDaoService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    User RetrieveOneUsers(@PathVariable int id){
        User user = userDaoService.getUser(id);
        if (user == null) throw new UserNotFoundException("id: " + id);
        return user;
    }

    @PostMapping("/users")
    public ResponseEntity<User> CreateUser(@Valid @RequestBody User user){
        userDaoService.Save(user);
                            // Servlet current request can return /users
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(user.getId())
                .toUri();

        // Return location of newly created user
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/users/{id}")
    void DeleteUsers(@PathVariable int id){
        userDaoService.DeleteById(id);
    }

}
