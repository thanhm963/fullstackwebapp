package com.fullstackthanh.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fullstackthanh.fullstackbackend.model.User;

//Jpảepository  luc create project da chon  spring data JPA
public interface UserRepository extends JpaRepository <User, Long>{

}
