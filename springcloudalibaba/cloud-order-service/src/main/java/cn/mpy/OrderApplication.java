package cn.mpy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
*@Author: make mpy
*@Description: order 启动类
*@Date: 2021/5/25 11:43
*/
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient //服务注册与发现
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class,args);
    }
    /*@Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }*/
}
