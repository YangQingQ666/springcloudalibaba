package cn.mpy.controller;

import cn.mpy.Video;
import cn.mpy.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
*@Author: make mpy
*@Description: OrderController
*@Date: 2021/5/25 11:45
*/
@RestController
@RequestMapping("api/v1/video_order")
public class OrderController {
    /*@Autowired
    private RestTemplate restTemplate;
    @Autowired
    private DiscoveryClient discoveryClient;*/
    @Autowired
    private VideoService videoService;
    @GetMapping("/save")
    public Object findById(Integer videoId){
        //Video forObject = restTemplate.getForObject("http://cloud-video-service/api/v1/video/find_by_id?videoId=" + videoId, Video.class);
        /*List<ServiceInstance> instances = discoveryClient.getInstances("cloud-video-service");
        ServiceInstance serviceInstance = instances.get(0);
        Video forObject = restTemplate.getForObject("http://"+serviceInstance.getHost()+":"+serviceInstance.getPort()+"/api/v1/video/find_by_id?videoId=" + videoId, Video.class);*/
        Video forObject = this.videoService.findById(videoId);
//        VideoOrder videoOrder=new VideoOrder();
//        videoOrder.setVideoId(forObject.getId());
//        videoOrder.setVideoTitle(forObject.getTitle());
//        videoOrder.setCreateTime(new Date());
//        videoOrder.setServerInfo(forObject.getServerInfo());
        return forObject;
    }
int temp=0;
    @GetMapping("/find_list")
    public Object findList(HttpServletRequest request){
        try {
            //压测
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        temp++;
        if (temp%3==0){
            //throw new RuntimeException();
        }
        Map<String,String> map=new HashMap<>();
        map.put("title","springcloud study");
        map.put("title1","springcloud study1");
        map.put("title2","springcloud study2");
        map.put("title2","springcloud study3");
        map.put("port",request.getServerPort()+"");
        return map;
    }
}
