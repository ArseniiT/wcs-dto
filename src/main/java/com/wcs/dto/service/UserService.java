package com.wcs.dto.service;

import com.wcs.dto.dto.UserDTO;
import com.wcs.dto.entity.User;
import com.wcs.dto.mapper.UserMapper;
import com.wcs.dto.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public UserDTO getUserById(Long userId) {
        Optional<User> userOptional = userRepository.findById(userId);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            return UserMapper.toDTO(user);
        } else {
            throw new RuntimeException("User not found");
        }
    }

    public UserDTO addUser(User user) {
        User savedUser = userRepository.save(user);
        return UserMapper.toDTO(savedUser);
    }
}
