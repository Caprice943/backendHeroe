package com.example.backendheroe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
@SpringBootApplication
public class BackendHeroeApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendHeroeApplication.class, args);
    }

}
