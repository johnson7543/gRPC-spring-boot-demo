package com.grpc.spring.server.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * <p>Description: </p>
 * @date 
 * @author 
 * @version 1.0
 * <p>Copyright:Copyright(c)2020</p>
 */
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = {"com.grpc"})
public class GrpcSpringServerStartup {

    public static void main(final String... args) {
        SpringApplication.run(GrpcSpringServerStartup.class, args);
    }

}
