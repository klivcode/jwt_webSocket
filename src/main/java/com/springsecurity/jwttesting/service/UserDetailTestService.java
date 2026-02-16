package com.springsecurity.jwttesting.service;


import com.springsecurity.jwttesting.dto.UserResponesDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserDetailTestService {
    List<UserResponesDto> getAllUser();
}
