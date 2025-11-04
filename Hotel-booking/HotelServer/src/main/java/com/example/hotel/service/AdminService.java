package com.example.hotel.service;

import com.example.hotel.model.Admin;
import java.util.Optional;

public interface AdminService {
    Admin registerAdmin(Admin admin);
    Optional<Admin> loginAdmin(String username, String password);
}