package com.wcs.dto.controller;

import com.wcs.dto.dto.UserDTO;
import com.wcs.dto.entity.User;
import com.wcs.dto.mapper.UserMapper;
import com.wcs.dto.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserDTO> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return users.stream()
                .map(UserMapper::toDTO)
                .collect(Collectors.toList());
    }
}
