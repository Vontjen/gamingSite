package com.vdab.gamingSite.services;

import com.vdab.gamingSite.domain.User;
import com.vdab.gamingSite.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class UserService {
    @Autowired
    private UserRepository ur;

    public UserService(UserRepository ur) {
        this.ur=ur;
    }

    public User findById(int id){
        return ur.findOne(id);
    }

    public void save(User u){
        ur.save(u);
    }
}
