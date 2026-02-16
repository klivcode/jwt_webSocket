package com.springsecurity.jwttesting.service.impl;

import com.springsecurity.jwttesting.dto.UserResponesDto;
import com.springsecurity.jwttesting.entity.UserDetailTest;
import com.springsecurity.jwttesting.repo.UserDetailTestRepo;
import com.springsecurity.jwttesting.service.UserDetailTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class UserDetaiTestlServiceImpl implements UserDetailTestService {
    @Autowired
    private UserDetailTestRepo  userDetailTestRepo;
    @Override
    public List<UserResponesDto> getAllUser() {
        List<UserDetailTest> allUser = userDetailTestRepo.findAll();
        return allUser.stream()
                .map(user->new UserResponesDto(
                        user.getId(),
                        user.getUsername(),
                        user.getRole().toString()
                )).toList();
    }
}
