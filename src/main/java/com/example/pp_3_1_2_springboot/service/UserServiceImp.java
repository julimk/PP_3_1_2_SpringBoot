package com.example.pp_3_1_2_springboot.service;

import com.example.pp_3_1_2_springboot.dao.UserDao;
import com.example.pp_3_1_2_springboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class UserServiceImp implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }


//    @Override
//    @Transactional
//    public void saveUser(User user) {
//        userDao.saveUser(user);
//    }
//
//
//    @Override
//    @Transactional
//    public void deleteUser(Long id) {
//        userDao.deleteUser(id);
//    }
//
//    @Override
//    @Transactional
//    public void updateUser(User user) {
//        userDao.updateUser(user);
//    }
//
//    @Override
//    @Transactional(readOnly = true)
//    public User findById(Long id) {
//        return userDao.findById(id);
//    }


}
