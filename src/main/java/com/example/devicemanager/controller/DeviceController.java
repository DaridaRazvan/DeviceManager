package com.example.devicemanager.controller;

import com.example.devicemanager.model.dto.DeviceDto;
import com.example.devicemanager.service.DeviceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/device")
@RequiredArgsConstructor
public class DeviceController {
    private final DeviceService deviceService;

    @GetMapping("/all")
    public ResponseEntity<List<DeviceDto>> getAllDevices(){
        return ResponseEntity.ok(deviceService.getAllDevices());
    }
}
