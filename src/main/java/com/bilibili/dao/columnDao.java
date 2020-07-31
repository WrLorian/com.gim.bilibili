package com.bilibili.dao;

import com.bilibili.pojo.column;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface columnDao {

    /**
     * 添加新的频道
     * @return
     */
    @Insert("insert into column (columnName) values (#{columnName})")
    public boolean columnInsert(@Param("columnName")String column);

    /**
     * 查询所有的频道
     * @return
     */
    @Select("select * from column")
    public List<column> columnSelectAll();

    /**
     * 删除频道
     */
    @Delete("delete from column where columnId=#{columnId}")
    public boolean columnDeleteByColumnId(@Param("column")int column);

    /**
     * 修改频道名称
     */
    @Update("update column set columnName=#{columnName} where columnId=#{columnId}")
    public boolean columnUpdate(column column);

}
