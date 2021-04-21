package com.sy.mapper;

import com.github.pagehelper.PageInfo;
import com.sy.model.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserMapper {


    @Select("select * from au_user where username = #{username} and password = #{password}")
    User selectByLogin(User user) throws Exception;

    @Delete("delete from user where id=#{id}")
    int delete(int id)throws Exception;

    @Update("update au_user set username = #{username},realName=#{realName},mobile=#{mobile},roleName=#{roleName},bankAccount=#{bankAccount}")
    int modify(User user) throws Exception;

    @Insert("insert into au_user values(#{username},#{realName},#{mobile},#{roleName},#{bankAccount})")
    int add(User user)throws Exception;

    @Select(value = {"<script>select * from au_user where",
            "<if test=\"username!=null and username!='' \">\n" +
            "        and username=#{username}\n" +
            "        </if>",
            "</script>"})
    List<User> selectAll(User user)throws Exception;


}
