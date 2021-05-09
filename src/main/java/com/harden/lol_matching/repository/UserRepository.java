package com.harden.lol_matching.repository;

import com.harden.lol_matching.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    /*
       Find a User through the given userId.
       @param userId
       @return  the user that was found (if any)
     */
    Optional<User> findById(String id);

}
