package com.travelagency.controller;

import com.travelagency.model.User;
import com.travelagency.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AuthController {

    private final AuthService service;


    @PostMapping("/signIn")
    public ResponseEntity<?> authenticateUser(@RequestBody User user) {
        return service.signIn(user);
    }

    @PostMapping("/signUp")
    public ResponseEntity<?> userRegistration(@Valid @RequestBody User user) {
        return service.userRegistration(user);
    }
}
