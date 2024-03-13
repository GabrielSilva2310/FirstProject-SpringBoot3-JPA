package com.coursejava.StartSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursejava.StartSpringBoot.entities.User;

public interface UserRepository extends JpaRepository<User, Long>  {

}
