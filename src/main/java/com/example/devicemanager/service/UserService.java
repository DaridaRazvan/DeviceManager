package com.example.devicemanager.service;

import com.example.devicemanager.model.dto.DeviceDto;

import java.util.List;

public interface UserService {
    List<DeviceDto> getUserDevices(Long id);
}
