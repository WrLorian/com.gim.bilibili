package com.bilibili.dao;

import com.bilibili.pojo.user;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface userDao {

    /**
     * 用户登录
     * @return
     */
    @Select("select * from user where userEmail=#{userEmail} and userPassWord=#{userPassWord}")
    public user userLogin(@Param("userEmail")String userEmail,@Param("userPassWord")String userPassWord);

    /**
     * 用户注册
     * @return boolean
     */
    @Insert("insert into user (userEmail,userPassWord) values (#{userEmail},#{userPassWord})")
    public boolean userInsert(user user);

    /**
     * 用户信息修改
     * @return boolean
     */
    @Update("update user set userName=#{userName},userEmail=#{userEmail},userPassWord=#{userPassWord},userInt=#{userInt} where userId=#{userId}")
    public boolean userUpdate(user user);

    /**
     * 查询所有用户
     * @return List<user>
     */
    @Select("select * from user")
    public List<user> userSelectAll();

    /**
     * 查询一共有多少用户
     * @return long
     */
    @Select("select count(*) from user")
    public long userTotalSelectAll();

    /**
     * 根据ID查询用户
     * @return user
     */
    @Select("select * from user where userId=#{userId}")
    public user userSelectById(@Param("userId")String userId);

    /**
     * 查询共有多少条搜索结果
     * @return long
     */
    @Select("select count(*) from user where userId=#{userId}")
    public long userTotalSelectById(@Param("userId")String userId);

    /**
     * 根据用户名称来查询用户
     * @return List<user>
     */
    @Select("select * from user where userName like %#{userName}%")
    public List<user> userSelectByUserName(@Param("userName")String userName);

    /**
     * 查询共有多少条搜索结果
     * @return long
     */
    @Select("select count(*) from user where userName like %#{userName}%")
    public long userTotalSelectByUserName(@Param("userName")String userName);


}
