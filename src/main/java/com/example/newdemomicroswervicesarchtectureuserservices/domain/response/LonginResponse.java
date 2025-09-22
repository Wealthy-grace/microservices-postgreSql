package com.example.newdemomicroswervicesarchtectureuserservices.domain.response;


import com.example.newdemomicroswervicesarchtectureuserservices.domain.dto.UserDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class LonginResponse {

    private String message;

    private String token;

    private UserDto user;
}
