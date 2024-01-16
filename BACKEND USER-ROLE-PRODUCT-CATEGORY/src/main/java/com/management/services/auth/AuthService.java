package com.management.services.auth;

import com.example.backendvoyageapp.dto.SignupDTO;
import com.example.backendvoyageapp.dto.UserDto;

public interface AuthService {
    UserDto createUser(SignupDTO signupDTO);

}
