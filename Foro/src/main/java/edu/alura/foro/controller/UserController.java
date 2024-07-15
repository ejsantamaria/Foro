package edu.alura.foro.controller;

import edu.alura.foro.entity.User;
import edu.alura.foro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("user/{id}")
    public User getUser(@PathVariable long id) {
        return userService.getUser(id);
    }

    @GetMapping("users")
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("user")
    public User createUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @PutMapping("user")
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }
}
