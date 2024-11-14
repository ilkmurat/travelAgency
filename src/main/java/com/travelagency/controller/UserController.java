package com.travelagency.controller;

import com.travelagency.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {
    private final UserService service;

    @GetMapping("/exists/byUserId")
    public Boolean existsByUserId(@RequestParam String userId) {
        return service.existsByUserId(userId);
    }

    @GetMapping("/exists/byEmail")
    public Boolean existsByEmail(@RequestParam String email) {
        return service.existsByEmail(email);
    }
}
