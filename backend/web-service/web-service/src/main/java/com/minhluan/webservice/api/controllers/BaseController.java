package com.minhluan.webservice.api.controllers;

import com.minhluan.webservice.api.services.JWTService;
import io.jsonwebtoken.Claims;

public class BaseController {

    private JWTService jwtService;

    public BaseController() {

    }

    private void validateUser(String jwt) {
        Claims claims = JWTService.getInstance().decodeJWT(jwt);
        
    }
}
