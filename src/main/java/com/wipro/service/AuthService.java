package com.wipro.service;


import com.wipro.dto.JwtAuthResponse;
import com.wipro.dto.LoginDto;
import com.wipro.dto.RegisterDto;

public interface AuthService {
    String register(RegisterDto registerDto);

    JwtAuthResponse login(LoginDto loginDto);
}