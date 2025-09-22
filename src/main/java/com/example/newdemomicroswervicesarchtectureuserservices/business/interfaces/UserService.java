package com.example.newdemomicroswervicesarchtectureuserservices.business.interfaces;


import com.example.newdemomicroswervicesarchtectureuserservices.domain.dto.UserDto;
import com.example.newdemomicroswervicesarchtectureuserservices.domain.request.SignUpRequest;

public interface UserService {

    UserDto createUser(SignUpRequest signUpRequest);

    UserDto LoginRequest(SignUpRequest signUpRequest);

    UserDto getUserByUsername(String username);

    UserDto getUserById(Long id);

    UserDto updateUser(UserDto userDto);

    void deleteUser(Long id);
}
