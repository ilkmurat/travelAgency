package com.travelagency.controller;

import com.travelagency.model.Location;
import com.travelagency.service.LocationService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api/location")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class LocationController {
    private final LocationService service;


    @PostMapping
    public Location create(@Valid @RequestBody Location ob, HttpServletRequest rq, HttpServletResponse rs) {
        rs.setStatus(HttpServletResponse.SC_CREATED);
        return service.create(ob, rs);
    }


    @GetMapping("/getAll/active")
    public List<Location> getAllActive(@RequestParam int page, @RequestParam int pageSize) {
        return service.getAll(true, PageRequest.of(page, pageSize));
    }


    @GetMapping("/getAll/inactive")
    public List<Location> getAllInactive(@RequestParam int page, @RequestParam int pageSize) {
        return service.getAll(false, PageRequest.of(page, pageSize));
    }



    @GetMapping("/get/{id}")
    @PreAuthorize("@securityService.checkSecurity(#id, #rq)")
    public Location getById(@PathVariable Long id, HttpServletRequest rq) {
        return service.getById(id);
    }


    @PutMapping
    public Location update(@Valid @RequestBody Location ob, HttpServletRequest rq, HttpServletResponse rs) {
        return service.update(ob, rs);
    }


    @GetMapping("getAll/active/dropdown")
    public List<Map<String, Object>> getAllActiveDropdown() {
        return service.getAllActiveDropdown();
    }


    @GetMapping("/exists/byName")
    public Boolean existsByName(@RequestParam String name) {
        return service.existsByName(name);
    }
}
