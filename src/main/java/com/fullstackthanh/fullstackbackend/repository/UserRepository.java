package com.fullstackthanh.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fullstackthanh.fullstackbackend.model.User;

public interface UserRepository extends JpaRepository <User, Long>{

}
