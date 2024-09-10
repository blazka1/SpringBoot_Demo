package com.example.demo.dao;

import com.example.demo.model.User;

import java.util.List;

public interface UserDAO {

    void save(User user);

    User findById(Long id);

    List<User> findAll();

    void deleteById(Long id);

    void editUser(User user);

}
