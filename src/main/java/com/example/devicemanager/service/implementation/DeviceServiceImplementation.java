package com.example.devicemanager.service.implementation;

import com.example.devicemanager.model.Device;
import com.example.devicemanager.model.dto.DeviceDto;
import com.example.devicemanager.repository.DeviceRepository;
import com.example.devicemanager.service.DeviceService;
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
public class DeviceServiceImplementation implements DeviceService {
    private final DeviceRepository deviceRepository;


    @Override
    public List<DeviceDto> getAllDevices() {
        log.info("Getting all devices");

        List<Device> devices = deviceRepository.findAll();

        List<DeviceDto> devicesDto = new ArrayList<>();
        devices.forEach(
                device -> devicesDto.add(new DeviceDto().convertModelToDto(device))
        );

        return devicesDto;
    }
}
