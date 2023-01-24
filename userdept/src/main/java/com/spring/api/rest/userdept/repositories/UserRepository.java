package com.spring.api.rest.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.api.rest.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
