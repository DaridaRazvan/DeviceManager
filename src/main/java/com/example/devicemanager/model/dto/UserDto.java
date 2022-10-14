package com.example.devicemanager.model.dto;

import com.example.devicemanager.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Long Id;
    private String name;
    private Long roleId;

    public UserDto convertModelToDto(User user){
        return new UserDto(
                user.getId(),
                user.getName(),
                user.getRole().getId()
        );
    }
}
