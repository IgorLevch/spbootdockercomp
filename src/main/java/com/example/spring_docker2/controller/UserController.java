package com.example.spring_docker2.controller;

import com.example.spring_docker2.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/user/{id}")
    public ResponseEntity<String> getUserName(@PathVariable Long id){
            String name = userService.getUserNameById(id);

            return new ResponseEntity<>(name, HttpStatus.OK);

    }


}
