package cn.mpy.service.impl;

import cn.mpy.Video;
import cn.mpy.dao.VideoMapper;
import cn.mpy.service.VideoSrvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
*@Author: make mpy
*@Description: VideoServiceIpml
*@Date: 2021/5/25 10:56
*/
@Service
public class VideoServiceIpml implements VideoSrvice {
    @Autowired
    private VideoMapper videoMapper;
    @Override
    public Video findById(Integer videoId) {
        return this.videoMapper.findById(videoId);
    }
}
