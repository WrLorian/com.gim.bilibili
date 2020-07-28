package com.bilibili.dao;

import com.bilibili.pojo.admin;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface adminDao {

    /**
     *  管理员登录
     * @return boolean
     */
    @Select("select * from admin where adminEmail=#{adminEmail} and adminPassWord=#{adminPassWord}")
    public admin adminLogin(@Param("adminEmail")String adminEmail,@Param("adminPassWord")String adminPassWord);

    /**
     *  管理员创建
     * @return boolean
     */
    @Insert("insert into admin(adminEmail,adminPassWord) values (#{adminEmail},#{adminPassWord})")
    public boolean adminCreate(admin admin);

    /**
     * 管理员信息修改
     * @return boolean
     */
    @Update("update admin set adminName=#{adminName},adminEmail=#{adminEmail},adminPassWord=#{adminPassWord} where adminId=#{adminId}")
    public boolean adminUpdate(admin admin);

    /**
     * 查询所有的管理员
     * @return List<admin>
     */
    @Select("select * from admin")
    public List<admin> adminSelectAll();

    /**
     * 查询所有的管理员一共有几位
     * @return long
     */
    @Select("select count(*) from admin")
    public long adminTotalSelectAll();

    /**
     * 通过ID查询管理员
     * @return admin
     */
    @Select("select * from admin where adminId=#{adminId}")
    public admin adminSelectByAdminId();

    /**
     * 通过名称或者账号来查询管理员
     * @return List<admin>
     */
    @Select("select * from admin where adminName like %#{adminName}% or adminEmail like %#{adminName}%")
    public List<admin> adminSelectByAdminName(@Param("adminName")String adminName);

    /**
     * 通过名称来查询的管理员一共有几位
     * @return long
     */
    @Select("select count(*) from admin where adminName like %#{adminName}% or adminEmail like %#{adminName}%")
    public long adminTotalSelectByAdminName(@Param("adminName")String adminName);



}
