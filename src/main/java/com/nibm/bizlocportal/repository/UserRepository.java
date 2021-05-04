package com.nibm.bizlocportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nibm.bizlocportal.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
