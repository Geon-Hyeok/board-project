package com.board.ghboardproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class GhBoardProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(GhBoardProjectApplication.class, args);
    }

}
