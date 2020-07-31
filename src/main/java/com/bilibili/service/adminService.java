package com.bilibili.service;

import com.bilibili.pojo.admin;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class adminService {
    /**
     * 验证管理员登录
     * @return
     */
    public boolean adminLoginCheck()
    {
        return true;
    }

    /**
     * 获取所有的管理员列表
     * @return
     */
    public List<admin> adminSelectAll()
    {
        return null;
    }

    /**
     * 获取所有管理员的总数
     * @return
     */
    public long adminTotalSelectAll()
    {
        return 0;
    }

    /**
     * 添加管理员
     * @return
     */
    public boolean adminInsert()
    {
        return true;
    }

    /**
     * 删除管理员
     * @return
     */
    public boolean adminDelete()
    {
        return true;
    }

    /**
     * 更新管理员的信息
     * @return
     */
    public boolean adminUpdate()
    {
        return true;
    }
}
