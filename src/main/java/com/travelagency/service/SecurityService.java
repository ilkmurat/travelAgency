package com.travelagency.service;

import com.travelagency.security.jwt.JwtProvider;
import io.jsonwebtoken.Claims;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SecurityService {
    @Autowired
    private JwtProvider tokenProvider;

    public Boolean checkSecurity(Long id, HttpServletRequest rq) {
        Claims claims = tokenProvider.extractAllClaims(rq);
        Long loggedUserId = Long.valueOf(claims.get("id").toString());
        return true;
    }
}
