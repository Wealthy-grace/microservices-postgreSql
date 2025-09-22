package com.example.newdemomicroswervicesarchtectureuserservices.business.Converter;


import com.example.newdemomicroswervicesarchtectureuserservices.domain.dto.UserDto;
import com.example.newdemomicroswervicesarchtectureuserservices.domain.request.SignUpRequest;
import com.example.newdemomicroswervicesarchtectureuserservices.persistence.entity.Role;
import com.example.newdemomicroswervicesarchtectureuserservices.persistence.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserConverDto {

    private UserDto mapToDTO(UserEntity entity) {
        return UserDto.builder()
                .id(entity.getId())
                .fullName(entity.getFullName())
                .username(entity.getUsername())
                .email(entity.getEmail())
                .role(String.valueOf(entity.getRole()))
                .image(entity.getImage())
                .build();
    }


    private UserEntity mapToEntity(SignUpRequest dto) {
        return UserEntity.builder()
                //.id(dto.getId())
                .fullName(dto.getFullName())
                .username(dto.getUsername())
                .email(dto.getEmail())
                .role(Role.ROLE_ADMIN)
                //.role(Role.valueOf(dto.getRole()))
                .image(dto.getImage())
                .build();
    }
}
