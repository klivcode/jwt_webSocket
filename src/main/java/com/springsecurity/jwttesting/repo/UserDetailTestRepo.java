package com.springsecurity.jwttesting.repo;

import com.springsecurity.jwttesting.entity.UserDetailTest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.Optional;

public interface UserDetailTestRepo extends JpaRepository<UserDetailTest, Long> {

    Optional<UserDetailTest> findByUsername(String admin);
}
