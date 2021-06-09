package cn.mpy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
*@Author: make mpy
*@Description: 启动类
*@Date: 2021/5/25 10:49
*/
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("cn.mpy.dao")
public class VideoApplication {
    public static void main(String[] args) {
        SpringApplication.run(VideoApplication.class, args);
    }
}
