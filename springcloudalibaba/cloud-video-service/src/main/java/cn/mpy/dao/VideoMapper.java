package cn.mpy.dao;


import cn.mpy.Video;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
*@Author: make mpy
*@Description: videoMapper
*@Date: 2021/5/25 10:54
*/
@Repository
public interface VideoMapper {
    /**
     * 单个查找
     * @param videoId
     * @return
     */
    @Select("select * from video where id=#{videoId}")
    Video findById(@Param("videoId") Integer videoId);
}
