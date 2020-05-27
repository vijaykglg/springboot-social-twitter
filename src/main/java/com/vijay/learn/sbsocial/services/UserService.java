package com.vijay.learn.sbsocial.services;
/*
Project : springboot-security-webapp
User    : Vijay Gupta
Date    : May 2020
*/


import com.vijay.learn.sbsocial.domain.User;

public interface UserService extends CRUDService<User> {
    User findByUsername(String username);
}
