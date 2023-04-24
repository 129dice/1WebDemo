package com.mapper;

import com.pojo.Cpu;
import com.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    /*查询所有*/

    @Select("select *from  user where userid=#{userid} and password=#{password}")
    User selectLogin(User user);
    @Insert("insert into user values(#{userid},#{username},#{password})")
    void addUser(User user);

    @Select("select *from  user ")
    List<User> selectAll();
}
