package com.harden.lol_matching.service;

import com.harden.lol_matching.entity.User;

import java.util.Optional;

public interface UserService {

    Optional<User> getUserById(String id);

}
