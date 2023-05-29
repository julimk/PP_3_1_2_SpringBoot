package com.example.pp_3_1_2_springboot.dao;

import jakarta.persistence.*;
import org.springframework.stereotype.Repository;
import com.example.pp_3_1_2_springboot.model.User;

import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void saveUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void deleteUser(Long id) {
        User user = entityManager.find(User.class, id);
        entityManager.remove(user);
    }

    @Override
    public void updateUser(User user) {
        entityManager.merge(user);

    }

    @Override
    public User findById(Long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public List<User> getAllUsers() {
        List<User> users = entityManager.createQuery("from User").getResultList();
        return users;
    }
}
