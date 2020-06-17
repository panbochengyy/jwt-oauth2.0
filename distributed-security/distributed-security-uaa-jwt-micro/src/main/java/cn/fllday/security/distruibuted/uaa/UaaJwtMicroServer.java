package cn.fllday.security.distruibuted.uaa;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
@EnableFeignClients(basePackages = {"cn.fllday.security.distruibuted.uaa"})
public class UaaJwtMicroServer {

    public static void main(String[] args) {
        SpringApplication.run(UaaJwtMicroServer.class);
    }

}
