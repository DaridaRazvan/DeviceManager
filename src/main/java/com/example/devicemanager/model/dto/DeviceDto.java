package com.example.devicemanager.model.dto;

import com.example.devicemanager.model.Device;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeviceDto {
    private Long id;
    private String name;
    private String timeUsed;
    private Long userId;

    public DeviceDto convertModelToDto(Device device){
        return new DeviceDto(
                device.getId(),
                device.getName(),
                device.getTimeUsed(),
                device.getUser().getId()
        );
    }
}
