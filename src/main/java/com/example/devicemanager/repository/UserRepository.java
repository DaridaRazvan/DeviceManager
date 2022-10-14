package com.example.devicemanager.repository;

import com.example.devicemanager.model.User;
import com.example.devicemanager.model.dto.DeviceDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
}
