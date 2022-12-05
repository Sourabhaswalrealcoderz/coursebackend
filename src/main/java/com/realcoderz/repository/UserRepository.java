package com.realcoderz.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.realcoderz.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
