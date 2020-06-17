package cn.fllday.security.distributed.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderJwtServer {

    public static void main(String[] args) {
        SpringApplication.run(OrderJwtServer.class,args);
    }

}
