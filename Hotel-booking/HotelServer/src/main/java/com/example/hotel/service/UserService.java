package com.example.hotel.service;

import com.example.hotel.model.User;
import java.util.List;
import java.util.Optional;

public interface UserService {
    User registerUser(User user);
    Optional<User> loginUser(String username, String password);
    List<User> getAllUsers();
    Optional<User> getUserById(Long id);
}