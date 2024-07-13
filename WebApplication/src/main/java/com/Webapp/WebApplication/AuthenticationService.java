package com.Webapp.WebApplication;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String username, String password) {
        boolean validName = username.equals("Bao");
        boolean validpass = password.equals("Password");
        
        return validName && validpass;
        
    }
}
