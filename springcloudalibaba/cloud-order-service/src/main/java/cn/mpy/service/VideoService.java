package cn.mpy.service;

import cn.mpy.Video;
import cn.mpy.service.fallback.VideoServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "cloud-video-service",fallback = VideoServiceFallback.class)
public interface VideoService {
    @GetMapping("/api/v1/video/find_by_id")
    Video findById(@RequestParam("videoId") Integer videoId);
}
