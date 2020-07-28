package com.bilibili.dao;

import com.bilibili.pojo.video;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface likeDao {

    /**
     * 查询单个用户点赞的视频
     * @return List<video>
     */
    @Select("select * from video where videoId=(select videoId from `like` where userId=#{userId})")
    public List<video> videoSelectByVideoIdSelectByUserId(@Param("userId")String userId);

    /**
     * 查询单个用户点赞的视频个数
     * @return long
     */
    @Select("select count(*) from 'like' where userId=#{userId}")
    public long videoTotalSelectByVideoIdSelectByUserId(@Param("userId")String userId);

    /**
     * 增加一个新的点击
     */
    @Insert("insert into 'like' (videoId,userId) values (#{videoId},#{userId})}")
    public boolean likeInsert(@Param("videoId")int videoId,@Param("userId")int userId);
}
