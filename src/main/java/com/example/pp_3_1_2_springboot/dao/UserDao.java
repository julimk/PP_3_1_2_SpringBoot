package com.example.pp_3_1_2_springboot.dao;

import com.example.pp_3_1_2_springboot.model.User;

import java.util.List;

public interface UserDao {


    public void saveUser(User user);

    public void deleteUser(Long id);


    public void updateUser(User user);

    public User findById(Long id);

    public List<User> getAllUsers();


}
