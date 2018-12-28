package com.itheima.service;

import com.itheima.domain.Users;
import org.springframework.stereotype.Service;


public interface UsersService {


    int add(Users user);

    Users findById(Users users);
}
