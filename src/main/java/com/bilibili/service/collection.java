package com.bilibili.service;

import com.bilibili.pojo.video;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class collection {
    /**
     * 添加新的收藏
     * @return
     */
    public boolean collectionInsert()
    {
        return true;
    }

    /**
     * 取消收藏
     * @return
     */
    public boolean collectionDelete()
    {
        return true;
    }

    /**
     * 查询一个用户收藏的所有视频
     * @return
     */
    public List<video> videoSelectByCollectionSelectByUserId()
    {
        return null;
    }
}
