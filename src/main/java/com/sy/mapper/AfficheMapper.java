package com.sy.mapper;

import com.sy.model.Affiche;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface AfficheMapper {

    @Select("select * from affiche where id=#{id}")
    Affiche selectById(int id) throws Exception;

    @Select({"<script>", "select * from affiche\n" +
            "        <where>\n" +
            "            <if test=\"id !=null\">\n" +
            "                and id=#{id}\n" +
            "            </if>\n" +
            "            <if test=\"title !=null and title!=''\">\n" +
            "                and title=#{title}\n" +
            "            </if>\n" +
            "        </where>", "</script>"})
    List<Affiche> selectPage(Affiche affiche) throws Exception;

    @Delete("delete from affiche where id=#{id}")
    int deleteById(int id) throws Exception;

    @Insert("insert into affiche (title,content,publisher,publishTime,startTime,endTime) " +
            "values (#{title},#{content},#{publisher},#{publishTime},#{startTime},#{endTime})")
    @SelectKey(keyProperty = "id", keyColumn = "ID",
            resultType = Affiche.class, before = false,
            statement = "select last_insert_id() as id from dual")
    int insert(Affiche affiche) throws Exception;

    @Update("update affiche set title=#{title},content=#{content},publisher=#{publisher}," +
            "publishTime=#{publishTime},startTime=#{startTime},endTime=#{endTime} where id=#{id}")
    int updateById(Affiche affiche) throws Exception;

}
