package com.bilibili.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface coinDao {
    /**
     * 投币
     * @return
     */
    public boolean coinInsert();

    /**
     * 取消投币
     * @return
     */
    public boolean coinDelete();
}
