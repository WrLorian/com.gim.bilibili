package com.bilibili.dao;

import com.bilibili.pojo.video;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface collectionDao {
    /**
     * 插入新的收藏
     * @return
     */
    @Insert("insert into collection (videoId,userId) values (#{videoId},#{userId})")
    public boolean collectionInsert();

    /**
     * 删除收藏
     * @return
     */

    /**
     * 删除收藏
     * @return
     */
    @Delete("delete from collection where collectionId =#{collectionId}")
    public boolean collectionDelete(@Param("collectionId")int collectionId);

    /**
     * 返回一个用户所有的收藏
     */
    @Select("select * from video where videoId=(select videoId from collection where userId=#{userId})")
    public List<video> videoSelectByCollectionSelectByUserId(@Param("userId")int userId);


}
