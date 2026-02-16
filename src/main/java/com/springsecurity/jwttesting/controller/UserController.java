package com.springsecurity.jwttesting.controller;

import com.springsecurity.jwttesting.dto.UserResponesDto;
import com.springsecurity.jwttesting.service.UserDetailTestService;
import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class UserController {

    private  final UserDetailTestService  userDetailTestService;

    public UserController(UserDetailTestService userDetailTestService) {
        this.userDetailTestService = userDetailTestService;
    }

    @GetMapping("/get")
    public ResponseEntity<List<UserResponesDto>> getUsers(){
        List<UserResponesDto> userResponesDtos=userDetailTestService.getAllUser();

        return new ResponseEntity<>(userResponesDtos, HttpStatus.OK);
    }


}
