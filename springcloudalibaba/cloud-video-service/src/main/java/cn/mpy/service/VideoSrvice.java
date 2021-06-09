package cn.mpy.service;

import cn.mpy.Video;

/**
*@Author: make mpy
*@Description: VideoSrvice
*@Date: 2021/5/25 10:55
*/
public interface VideoSrvice {
    /**
     * 查找单个
     * @param videoId
     * @return
     */
    Video findById(Integer videoId);
}
