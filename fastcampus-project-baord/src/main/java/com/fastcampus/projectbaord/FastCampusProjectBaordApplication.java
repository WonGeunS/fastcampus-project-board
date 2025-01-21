package com.fastcampus.projectbaord;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;


@ConfigurationPropertiesScan
@SpringBootApplication
public class FastCampusProjectBaordApplication {

    public static void main(String[] args) {
        SpringApplication.run(FastCampusProjectBaordApplication.class, args);
    }

}
