package com.example.devicemanager.repository;

import com.example.devicemanager.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Long> {

}
