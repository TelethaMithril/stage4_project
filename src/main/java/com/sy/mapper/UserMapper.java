package com.sy.mapper;

import com.sy.model.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("select * from user where username = #{username} and password = #{password}")
    User selectByLogin(User user) throws Exception;

    @Delete("delete from user where id=#{id}")
    int delete(int id)throws Exception;



}
