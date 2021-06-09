package cn.mpy.controller;

import cn.mpy.Video;
import cn.mpy.service.VideoSrvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
*@Author: make mpy
*@Description: video控制类
*@Date: 2021/5/25 10:50
*/
@RestController
@RequestMapping("api/v1/video")
public class VideoController {
    @Autowired
    private VideoSrvice videoSrvice;
    /**
     * 查找单个
     * @param videoId
     * @return
     */
    @RequestMapping("find_by_id")
    public Object findById(Integer videoId,HttpServletRequest req){
        Video byId = this.videoSrvice.findById(videoId);
        byId.setServerInfo(req.getServerName()+":"+req.getServerPort());
        return byId;
    }
}
