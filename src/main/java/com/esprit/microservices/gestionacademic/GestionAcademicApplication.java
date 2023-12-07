package com.esprit.microservices.gestionacademic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class GestionAcademicApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionAcademicApplication.class, args);
    }

}
