package com.itheima.dao;

import com.itheima.domain.Users;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface UsersDao {


    @Insert("insert into users values(null,#{username},#{password},#{telephone},#{state})")
    int add(Users user);


    @Select("select * fron users where username =#{username} and password = #{password}")
    Users findById(Users users);

}
