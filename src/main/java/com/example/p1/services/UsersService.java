package com.example.p1.services;

import com.example.p1.models.User;
import com.example.p1.repositories.UsersRepository;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {
    @Autowired
    private UsersRepository usersRepository;

    public List<User> read() {
        return usersRepository.read();
    }

    public Integer create(User user) {
        return usersRepository.create(user);
    }

    public Integer delete(Integer userPk) {
        return usersRepository.delete(userPk);
    }

    public Integer update(@Param("userPk") Integer userPk, @Param("user") User user) {
        return usersRepository.update(userPk, user);
    }
}