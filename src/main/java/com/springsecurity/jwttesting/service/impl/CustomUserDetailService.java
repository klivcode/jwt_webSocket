package com.springsecurity.jwttesting.service.impl;

import com.springsecurity.jwttesting.repo.UserDetailTestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private  UserDetailTestRepo  userDetailTestRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userDetailTestRepo.findByUsername(username)
                .orElseThrow(()-> new UsernameNotFoundException("Username not found"));
    }
}
