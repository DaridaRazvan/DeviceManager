package com.example.devicemanager.controller;

import com.example.devicemanager.model.dto.DeviceDto;
import com.example.devicemanager.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("devices/{id}")
    public ResponseEntity<List<DeviceDto>> getUserDevices(@PathVariable("id") Long id){
        return ResponseEntity.ok(userService.getUserDevices(id));
    }
}
