package com.itheima.service.impl;

import com.itheima.dao.UsersDao;
import com.itheima.domain.Users;
import com.itheima.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersDao usersDao;

    public int add(Users user) {

        return usersDao.add(user);
    }

    public Users findById(Users users) {
        return usersDao.findById(users);
    }
}
