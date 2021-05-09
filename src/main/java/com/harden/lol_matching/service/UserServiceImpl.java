package com.harden.lol_matching.service;

import com.harden.lol_matching.entity.User;
import com.harden.lol_matching.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Transactional
    @Override
    public Optional<User> getUserById(String id) {
        return userRepository.findById(id);
    }

}
