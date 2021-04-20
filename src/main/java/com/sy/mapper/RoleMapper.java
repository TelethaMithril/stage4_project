package com.sy.mapper;

import com.sy.model.Role;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @ClassName RoleMapper
 * @Description TODO
 * @Author Administrator
 * @Date: 2021/4/20 9:52
 * @Version 1.0
 */
public interface RoleMapper {

    @Select("select * from role where id = #{id}")
    Role selectById(int id)throws Exception;
    @Insert("insert into role (roleCode,roleName,createDate,isStart,createBy) values (#{roleCode},#{roleName},#{createDate},#{isStart},#{createBy})")
    int insert(Role role) throws Exception;
    @Delete("delete from role where id = #{id}")
    int delete(int id)throws Exception;
    @Update("update role set roleCode=#{roleCode},roleName=#{roleName},createDate=#{createDate},isStart=#{createDate} where id = #{id}")
    int update(Role role)throws Exception;
    @Select("select * from role")
    List<Role> selectAll() throws Exception;
}
