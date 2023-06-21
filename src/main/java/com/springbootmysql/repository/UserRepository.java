package com.springbootmysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootmysql.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
