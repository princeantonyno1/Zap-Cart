package com.digitalstore.imperium.library.service;

import com.digitalstore.imperium.library.dto.AdminDto;
import com.digitalstore.imperium.library.model.Admin;

public interface AdminService {
    Admin findByUsername(String username);

    Admin save(AdminDto adminDto);
}
