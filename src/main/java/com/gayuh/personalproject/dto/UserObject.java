package com.gayuh.personalproject.dto;

import com.gayuh.personalproject.enumerated.Role;

public record UserObject(
        String id,
        String email,
        Role role
) {
}
