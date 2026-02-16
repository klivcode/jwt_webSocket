package com.springsecurity.jwttesting.seed;


import com.springsecurity.jwttesting.dto.RoleDto;
import com.springsecurity.jwttesting.entity.UserDetailTest;
import com.springsecurity.jwttesting.repo.UserDetailTestRepo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class SeedUsers {

    @Bean
    public CommandLineRunner createAdminUser(UserDetailTestRepo userDetailTestRepo,
                                             PasswordEncoder passwordEncoder) {
        return args -> {
            if(userDetailTestRepo.findByUsername("user1").isEmpty()) {
                UserDetailTest userCredential = new UserDetailTest();
                userCredential.setUsername("user1");
                userCredential.setPassword(passwordEncoder.encode("user"));
                userCredential.setRole(RoleDto.USER);
                userDetailTestRepo.save(userCredential);
                System.out.println("User created Username: " + userCredential.getUsername());
            }
            else {
                System.out.println("Username already exists");
            }

        };
    }
}
