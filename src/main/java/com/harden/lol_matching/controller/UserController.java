package com.harden.lol_matching.controller;

import com.harden.lol_matching.dto.UserDto;
import com.harden.lol_matching.entity.User;
import com.harden.lol_matching.exception.NotFoundException;
import com.harden.lol_matching.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/api/user/{id}")
    public ResponseEntity<?> findUser(@PathVariable String id){

        final User user = userService.getUserById(id)
                .orElseThrow(() -> new NotFoundException("User"));

//        return ResponseEntity.ok();
        return null;
    }


    @PostMapping("/api/user")
    public String saveUser(@RequestBody UserDto request){


        return "";
    }

}
