package com.example.demo.service;

import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        // Dummy user (replace with DB logic)
        if ("admin".equals(username)) {
            return new User("admin", "{Bcrypt}"+"password", Collections.emptyList());
        }

        throw new UsernameNotFoundException("User not found");
    }
}