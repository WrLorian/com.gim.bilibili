package com.bilibili.service;

import com.bilibili.pojo.column;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class columnService {
    /**
     * 添加一个新的频道
     * @return
     */
    public boolean columnInsert()
    {
        return true;
    }

    /**
     * 删除一个频道
     * @return
     */
    public boolean columnDelete()
    {
        return true;
    }

    /**
     * 返回所有的频道
     * @return
     */
    public List<column> columnSelectAll()
    {
        return null;
    }
}
