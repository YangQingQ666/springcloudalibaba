package cn.mpy.service.fallback;

import cn.mpy.Video;
import cn.mpy.service.VideoService;
import org.springframework.stereotype.Service;

@Service
public class VideoServiceFallback implements VideoService {
    @Override
    public Video findById(Integer videoId) {
        Video video=new Video();
        video.setTitle("这是fallback里面的视频");
        return video;
    }
}
