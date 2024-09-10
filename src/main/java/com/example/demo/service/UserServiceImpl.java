package com.example.demo.service;

import com.example.demo.dao.UserDAO;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userDAO.findById(id);
    }

    @Override
    @Transactional
    public void addUser(User user) {
        userDAO.save(user);
    }

    @Override
    @Transactional
    public void deleteUser(Long id) {
        userDAO.deleteById(id);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        userDAO.editUser(user);
    }
}
