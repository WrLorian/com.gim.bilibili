package com.bilibili.dao;

import com.bilibili.pojo.video;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface videoDao {

    /**
     * 用户上传视频
     * @return boolean
     */
    @Insert("insert into video (userId,videoName,videoImg,videoUrl,videoInt) "+
            "values(#{userId},#{videoName},#{videoImg},#{videoUrl},#{videoInt})")
    public boolean videoInsert(video video);

    /**
     * 用户删除视频
     * @return boolean
     */
    @Delete("delete from video where videoId=#{videoId}")
    public boolean videoDelete(@Param("videoId")int videoId);

    /**
     * 用户修改视频
     * @return boolean
     */
    @Update("update video set videoName=#{videoName},videoImg=#{videoImg},videoUrl=#{videoUrl},videoInt=#{videoInt} where videoId")
    public boolean videoUpdate(video video);

    /**
     * 查询一个用户的全部视频
     * @return
     */
    @Select("select * from video where userId=#{userId}")
    public List<video> videoSelectByUserId(@Param("userId")Integer userId);

    /**
     * 通过视频名称来搜索视频
     * @return List<video>
     */
    @Select("select * from video where videoName like %#{videoName}%")
    public List<video> videoSelectByVideoName(@Param("videoName")String videoName);

    /**
     * 查询全部视频
     * @return
     */
    @Select("select * from video")
    public List<video> videoSelectAll();

    /**
     * 查询一个分类里边的全部视频
     * @return List<video>
     */
    @Select("select * from video where columnId=#{columnId}")
    public List<video> videoSelectByColumnId(@Param("columnId")Integer columnId);

    /**
     * 根据发布时间来查询视频
     * @return List<video>
     */
    @Select("select * from video where videoName like %#{videoName}% order by grade videoTime")
    public List<video> videoSelectByVideoNameOrderVideoTime();

    /**
     * 根据点赞次数来查询视频
     * @return List<video>
     */
    @Select("select * from video where videoName like %#{videoName}% order by grade likeNum")
    public List<video> videoSelectByVideoNameOrderLikeNum();



}
