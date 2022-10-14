package com.example.devicemanager.service.implementation;

import com.example.devicemanager.model.Device;
import com.example.devicemanager.model.dto.DeviceDto;
import com.example.devicemanager.repository.UserRepository;
import com.example.devicemanager.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class UserServiceImplementation implements UserService {
    private final UserRepository userRepository;

    @Override
    public List<DeviceDto> getUserDevices(Long id) {
        List<Device> devices = userRepository.findById(id).get().getDevices();

        List<DeviceDto> devicesDto = new ArrayList<>();
        devices.forEach(
                device -> devicesDto.add(new DeviceDto().convertModelToDto(device))
        );

        return devicesDto;
    }
}
