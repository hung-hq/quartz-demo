package com.example.quartzdemo;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class QuartzDemoApplication {

    public static void main(String[] args) {
//        SpringApplication.run(QuartzDemoApplication.class, args);
        new SpringApplicationBuilder(QuartzDemoApplication.class).bannerMode(Banner.Mode.OFF).run(args);
    }

}
